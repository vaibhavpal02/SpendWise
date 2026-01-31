package spendwise.main;

import spendwise.exceptions.EmptyCategoryException;
import spendwise.exceptions.InvalidAmountException;
import spendwise.manager.ExpenseManager;
import spendwise.model.Expense;

import java.util.List;
import java.util.Scanner;

public class SpendWiseApp {

    public static void main(String[] args) {

        System.out.println("SpendWise Started");

        Scanner scanner = new Scanner(System.in);
        ExpenseManager manager = new ExpenseManager();

        boolean running = true;

        while (running) {
            System.out.println("\n==== SpendWise Menu ====");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. Delete Expense");
            System.out.println("4. Show Total Expense");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    try {
                        System.out.print("Enter amount: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.print("Enter category: ");
                        String category = scanner.nextLine();

                        System.out.print("Enter date (YYYY-MM-DD): ");
                        String date = scanner.nextLine();

                        System.out.print("Enter note: ");
                        String note = scanner.nextLine();

                        manager.addExpense(amount, category, date, note);
                        System.out.println("Expense added successfully!");

                    } catch (InvalidAmountException | EmptyCategoryException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    List<Expense> expenses = manager.getAllExpenses();

                    if (expenses.isEmpty()) {
                        System.out.println("No expenses found.");
                    } else {
                        for (Expense expense : expenses) {
                            System.out.println(expense.getSummary());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Expense ID to delete: ");
                    int id = scanner.nextInt();

                    boolean deleted = manager.deleteExpenseById(id);
                    if (deleted) {
                        System.out.println("Expense deleted successfully.");
                    } else {
                        System.out.println("Expense not found.");
                    }
                    break;

                case 4:
                    double total = manager.calculateTotal(manager.getAllExpenses());
                    System.out.println("Total Expense: " + total);
                    break;

                case 5:
                    running = false;
                    System.out.println("Exiting SpendWise. Bye!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
