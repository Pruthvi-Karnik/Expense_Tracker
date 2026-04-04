package libraryManagementSystem.database;

import java.util.ArrayList;
import java.util.Scanner;

public class users {
    ArrayList<String> bookname = new ArrayList<String>();
    ArrayList<String> magname = new ArrayList<String>();
    private String name;
    private String passWord;
    private String email;
    private int registerNo;
    private int phoneNo;
    int borrowedBooks=0;
    users(String name,String password, String email, int registerNo, int phoneNo) {
        this.name=name;
        this.email=email;
        this.registerNo=registerNo;
        this.phoneNo=phoneNo;
        this.passWord=password;
    }

    public users() {

    }
    public void user() {
        System.out.println("Enter 1 to borrow a book and 2 to return it\n");
        int ch;
        Scanner sc = new Scanner((System.in));
        ch= sc.nextInt();
        switch(ch) {
            case 1:
                if (borrowedBooks == 5) {
                    System.out.println("Borrowing limit reached. " +
                            "Please return a previously borrowed book to continue");
                } else {
                    System.out.println("Enter the name of the book you wanna borrow: ");
                    String name= sc.nextLine();
                    if(bookname.contains(name)) {
                        borrowedBooks++;
                        System.out.println("Thank you for using our services. Please leave a review");
                    }


                }
            case 2:
                if(borrowedBooks==0){
                    System.out.println("All the borrowed books have been returned!" +
                            "Thank you for visiting!");
                }
                else{
                    System.out.println("Enter the name of the book to be returned: ");
                    name= sc.nextLine();
                    if(bookname.contains(name)) {
                        borrowedBooks--;
                        System.out.println("Thank you for using our services. Please leave a review");
                    }
                }
            default:
                System.out.println("Invalid Input!!");
        }

    }

     users(String name,String passWord, int phoneNo, String email) {
         this.name= name;
         this.email=email;
         this.phoneNo=phoneNo;
         this.passWord=passWord;
     }
     public users(String name, String passWord) {
         this.name=name;
         this.passWord=passWord;
     }
     public String getName(){
         return name;
     }
     protected String getPassWord() {
         return passWord;
     }
     public boolean checkPassword(String password) {
        return this.passWord.equals(password);
     }
}
