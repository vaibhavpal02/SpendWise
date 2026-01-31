package spendwise.manager;

import spendwise.exceptions.EmptyCategoryException;
import spendwise.exceptions.InvalidAmountException;
import spendwise.model.Expense;
import spendwise.util.Calculations;

import java.util.ArrayList;
import java.util.List;

public class ExpenseManager implements Calculations {

    private List <Expense> expenses;
    private int expenseCounter;

    // Constructor
    public ExpenseManager() {
        this.expenses = new ArrayList<>();
        this.expenseCounter = 1;
    }

    // Add Expense
    public void addExpense(double amount, String category, String date, String note)
            throws InvalidAmountException, EmptyCategoryException {

        validateAmount(amount);
        validateCategory(category);

        Expense expense = new Expense(
                expenseCounter++,
                amount,
                category,
                date,
                note
        );

        expenses.add(expense);
    }

    // View All Expenses
    public List<Expense> getAllExpenses() {
        return expenses;
    }

    // Delete Expense by ID
    public boolean deleteExpenseById(int expenseId) {
        for (Expense expense : expenses) {
            if (expense.getExpenseId() == expenseId) {
                expenses.remove(expense);
                return true;
            }
        }
        return false;
    }

    // Filter Expenses by Category
    public List<Expense> getExpensesByCategory(String category) {
        List<Expense> filteredExpenses = new ArrayList<>();

        for (Expense expense : expenses) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                filteredExpenses.add(expense);
            }
        }

        return filteredExpenses;
    }

    // ================= Calculations Interface =================

    @Override
    public double calculateTotal(List<Expense> expenses) {
        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        return total;
    }

    @Override
    public double calculateMonthlyTotal(List<Expense> expenses, String month) {
        double total = 0;

        for (Expense expense : expenses) {
            if (expense.getDate().contains(month)) {
                total += expense.getAmount();
            }
        }

        return total;
    }

    // ================= Validation Methods =================

    private void validateAmount(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be greater than zero");
        }
    }

    private void validateCategory(String category) throws EmptyCategoryException {
        if (category == null || category.trim().isEmpty()) {
            throw new EmptyCategoryException("Category cannot be empty");
        }
    }
}
