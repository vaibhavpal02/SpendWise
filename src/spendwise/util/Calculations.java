package spendwise.util;

import spendwise.model.Expense;

import java.util.List;

public interface Calculations {

    double calculateTotal(List<Expense> expenses);

    double calculateMonthlyTotal(List<Expense> expenses, String month);
}
