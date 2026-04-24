package expenseTracker;

import expenseTracker.model.Expense;
import expenseTracker.service.ExpenceService;
import expenseTracker.util.InputUtil;

public class main {
    public static void main(String[] args) {
        ExpenceService service = new ExpenceService();

        while (true) {
            System.out.println("\n1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Spending");
            System.out.println("4. Category-wise Spending");
            System.out.println("5. Exit");

            int choice = (int) InputUtil.getDouble("Choose: ");

            switch (choice) {
                case 1:
                    String category = InputUtil.getString("Category: ");
                    double amount = InputUtil.getDouble("Amount: ");
                    String date = InputUtil.getString("Date: ");

                    service.addExpense(new Expense(category, amount, date));
                    break;

                case 2:
                    service.viewAllExpenses();
                    break;

                case 3:
                    service.showTotalExpense();
                    break;

                case 4:
                    service.showCategoryWiseSpending();
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
