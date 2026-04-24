package expenseTracker.storage;
import expenseTracker.model.Expense;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileStorage {
    private static final String FILE_NAME = "expenses.txt";

    public void saveExpense(Expense expense) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(expense.toFileString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving expense: " + e.getMessage());
        }
    }

    public List<Expense> loadExpenses() {
        List<Expense> expenses = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Expense expense = Expense.fromFileString(line);
                if (expense != null) {
                    expenses.add(expense);
                }
            }
        } catch (IOException e) {
            System.out.println("No existing data found.");
        }

        return expenses;
    }
}
