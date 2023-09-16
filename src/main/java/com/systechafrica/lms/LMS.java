//Library Management System
package com.systechafrica.lms;

import java.util.Scanner;

import com.systechafrica.reusablecode.ReusableCode;

public class LMS {
    Scanner scanner = new Scanner(System.in);
    final int MAX_BOOKS = 10;
    Book[] book = new Book[MAX_BOOKS];
    int booksBorrowed = 0;
    int studentNo;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LMS lms = new LMS(); 
        ReusableCode rs = new ReusableCode();

        boolean loggedIn = rs.login();
        if(loggedIn){
            System.out.println("successful login.");
            System.out.println();
            boolean oneMoreBook = true;
            while(oneMoreBook){
                lms.displayMenu();
                System.out.print("Choose an option from the menu: ");
                int option = scanner.nextInt();
                switch (option){
                    case 1:
                        //? Borrow a book
                        lms.borrowBook();
                        break;
                    
                    case 2:
                        //? view borrowed books
                        break;

                    case 3:
                        //? Return a book
                        break; 
                        
                    case 4:
                        //? quit
                        break;
                
                    default:
                        System.out.println("You have entered and invalid option.");
                        break;
                }
            }
        }
    scanner.close();
    }

    public void displayMenu(){
        System.out.println("----------------------------------");
        System.out.println("SYSTECH Library Managment System:");
        System.out.println("----------------------------------");
        System.out.println("1. Borrow a book");
        System.out.println("2. View borrowed books");
        System.out.println("3. Return a book");
        System.out.println("4. Quit");
    }
    
    public boolean borrowBook(){
        boolean oneMoreBook = false;
        System.out.print("Enter your student number: ");
        studentNo = scanner.nextInt();

        System.out.print("Enter ISBN number: ");
        int isbnNo = scanner.nextInt();
        System.out.print("Enter title of the book: ");
        String title = scanner.next();

        Book books = new Book(isbnNo, title);
        book[booksBorrowed] = books;
        booksBorrowed++;

        System.out.print("Do you want to issue another book? ");
        String anotherBook = scanner.next();
        if(anotherBook.equalsIgnoreCase("Y")){
                oneMoreBook = true;
            }
        else{
            System.out.println("No more books to enter.");
        }

        return oneMoreBook; 
    }

}
