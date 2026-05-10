package expenseTracker.service;

import expenseTracker.model.Expense;
import expenseTracker.storage.FileStorage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenceService {
    private FileStorage storage = new FileStorage();

    public void addExpense(Expense expense) {
        storage.saveExpense(expense);
    }

    public void viewAllExpenses() {
        List<Expense> expenses = storage.loadExpenses();
        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    public void showTotalExpense() {
        List<Expense> expenses = storage.loadExpenses();
        double total = 0;

        for (Expense e : expenses) {
            total += e.getAmount();
        }

        System.out.println("Total Spending: " + total);
    }

    public void showCategoryWiseSpending() {
        List<Expense> expenses = storage.loadExpenses();
        Map<String, Double> map = new HashMap<>();

        for (Expense e : expenses) {
            map.put(e.getCategory(),
                    map.getOrDefault(e.getCategory(), 0.0) + e.getAmount());
        }

        for (String category : map.keySet()) {
            System.out.println(category + ": " + map.get(category));
        }
    }
}
