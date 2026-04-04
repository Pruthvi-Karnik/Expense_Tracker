package libraryManagementSystem.database;

import libraryManagementSystem.items.*;
import java.util.ArrayList;
import java.util.Scanner;

public class admin extends users {
    Scanner sc;
    public admin(String name, String password, int phoneNo, String email) {
        super(name, password,phoneNo,email);
    }
    public admin(String name, String password){
        super(name,password);
    }
    public void adminPrivilages() {
        System.out.println("Do you wanna add or delete books?(Enter 'yes' or 'no')");
        sc= new Scanner(System.in);
        String ans=sc.nextLine();
        if (ans.equalsIgnoreCase("yes")) {
            System.out.println("Enter 1 to add books, 2 to add magazines," +
                    " 3 to remove boosl and 4 to remove magazines");
            int ch= sc.nextInt();
            sc.next();
            ArrayList<books> books = new ArrayList<books>();
            books b;
            ArrayList<magazines> magazines = new ArrayList<magazines>();
            magazines m;
            switch(ch) {
                case 1:
                    System.out.println("Enter the title, author name, " +
                            "year of publication and the edition number:\n");
                    String name = sc.nextLine();
                    if (bookname.contains(name)) {
                        System.out.println("The book" + name + " already exists in the " +
                                "Library.");
                        break;
                    } else
                        bookname.add(name);
                    String author = sc.nextLine();
                    int yr = sc.nextInt();
                    sc.next();
                    int edition = sc.nextInt();
                    sc.next();
                    b = new books(name, author, yr, edition);
                    books.add(b);
                case 2:
                    System.out.println("Enter the name and issue number of the magazine");
                    name = sc.nextLine();
                    if (magname.contains(name)) {
                        System.out.println("the magazine" + name + " is already available here");
                    } else {
                        magname.add(name);
                    }
                    int issueno = sc.nextInt();
                    m = new magazines(name, issueno);
                    magazines.add(m);
                case 3:
                    System.out.println("Enter the name of the book to be reomoved: ");
                    name = sc.nextLine();
                    if (bookname.contains(name)) {
                        bookname.remove(name);
                        System.out.println("Enter the year of publication, edition n authorname of" + name);
                        yr = sc.nextInt();
                        edition = sc.nextInt();
                        sc.next();
                        author = sc.nextLine();
                        b = new books(name, author, yr, edition);
                        books.remove(b);
                    } else {
                        System.out.println("Book not found");
                    }
                case 4:
                    System.out.println("Enter the name of the magazine to be reomoved: ");
                    name = sc.nextLine();
                    if (magname.contains(name)) {
                        magname.remove(name);
                        System.out.println("Enter the issuenumber of" + name);
                        issueno = sc.nextInt();
                        m = new magazines(name, issueno);
                        magazines.remove(m);
                    } else {
                        System.out.println("Magazine not found");
                    }
                default:
                    System.out.println("Invalid Input!!");
            }
        }
        else{
            System.out.println("Sure! Have a great day!");
        }
    }
}
