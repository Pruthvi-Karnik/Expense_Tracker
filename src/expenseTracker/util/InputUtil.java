package expenseTracker.util;

import java.util.Scanner;

public class InputUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static double getDouble(String message) {
        System.out.print(message);
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }
}
