package spendwise.model;

/**
 * Abstract base class representing a generic expense.
 * Contains common fields and enforces summary behavior.
 */
public abstract class BaseExpense {

    protected int expenseId;
    protected double amount;
    protected String category;
    protected String date;
    protected String note;

    // Constructor
    public BaseExpense(int expenseId, double amount, String category, String date, String note) {
        this.expenseId = expenseId;
        this.amount = amount;
        this.category = category;
        this.date = date;
        this.note = note;
    }

    // Getters and Setters
    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    // Abstract method
    public abstract String getSummary();
}
