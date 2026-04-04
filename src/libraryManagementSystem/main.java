package libraryManagementSystem;

import libraryManagementSystem.database.admin;
import libraryManagementSystem.database.regularUser;
import libraryManagementSystem.database.users;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    static Scanner sc = new Scanner(System.in);

    // acts like your database
    static ArrayList<users> userCredentials = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1. Login\n2. Register\n3. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void register() {

        System.out.println("Enter name:");
        String name = sc.nextLine();

        for (users u : userCredentials) {
            if (u.getName().equals(name)) {
                System.out.println("Username already exists");
                return;
            }
        }

        System.out.println("Enter password:");
        String password = sc.nextLine();

        System.out.println("Enter phone number:");
        int phone = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter email:");
        String email = sc.nextLine();

        System.out.println("Enter 1 for admin, 2 for regular user:");
        int type = sc.nextInt();
        sc.nextLine();

        users newUser;

        if (type == 1) {
            newUser = new admin(name, password, phone, email);
        } else {
            System.out.println("Enter register number:");
            int regNo = sc.nextInt();
            sc.nextLine();

            newUser = new regularUser(name, password, email, regNo, phone);
        }

        userCredentials.add(newUser);

        System.out.println("Registration successful");
    }
    static void login() {

        System.out.println("Enter name:");
        String name = sc.nextLine();

        System.out.println("Enter password:");
        String password = sc.nextLine();

        boolean userFound = false;
        boolean passwordCorrect = false;

        users loggedInUser = null;

        for (users u : userCredentials) {

            if (u.getName().equals(name)) {
                userFound = true;

                if (u.checkPassword(password)) {
                    passwordCorrect = true;
                    loggedInUser = u;
                }

                break;
            }
        }

        if (!userFound) {
            System.out.println("User does not exist");
            return;
        }

        if (!passwordCorrect) {
            System.out.println("Invalid credentials");
            return;
        }

        System.out.println("Login successful");

        if (loggedInUser instanceof admin) {
            System.out.println("Welcome Admin");
            admin ad= new admin(name, password);
            ad.user();
            ad.adminPrivilages();
        } else if (loggedInUser instanceof regularUser) {
            System.out.println("Welcome User");
            users regular = new users(name, password);
            regular.user();

        }
    }
}