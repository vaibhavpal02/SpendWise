package spendwise.model;

/**
 * Concrete implementation of an Expense.
 * Extends BaseExpense and provides summary details.
 */
public class Expense extends BaseExpense {


    // Constructor with all fields
    public Expense(int expenseId, double amount, String category, String date, String note) {
        super(expenseId, amount, category, date, note);
    }

    public Expense(int expenseId, double amount, String category, String date) {
        super(expenseId, amount, category, date, " ");
    } // Constructor overloading (without note)

    @Override
    public String getSummary() {
        return "ID: " + expenseId +
                ", Amount: " + amount +
                ", Category: " + category +
                ", Date: " + date +
                ", Note: " + note;
    }
}
