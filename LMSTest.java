package com.test;

import java.util.Scanner;

import com.dao.LibraryImpl;
import com.dao.User;
import com.pojo.Book;

public class LMSTest {
public static void main(String[]args) {
	LibraryImpl library=new LibraryImpl();
	Scanner scanner=new Scanner(System.in);
	//Sample data
	library.addBooks(new Book(1,"Adventures of Tom Sawyer"," Mark Twain"));
	library.addBooks(new Book(2,"Agni Veena","Kazi Nasrul Islam"));
	library.addBooks(new Book(3,"Ben Hur"," Lewis Wallace"));
	library.addBooks(new Book(4,"Baburnama","Babur"));
	library.registerUser(new User(1236,"kobal"));
	library.registerUser(new User(2341,"binkel"));
	int choice;
	do {
		System.out.println("<-----Library Menu--->");
		System.out.println("1. Show all books");
        System.out.println("2. Issue book");
        System.out.println("3. Return book");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice= scanner.nextInt();
        switch(choice) {
        case 1:
        		library.displayAllBooks();
        		break;
        case 2:
        		System.out.println("Enter the User Id");
        		int issueUserId=scanner.nextInt();
        		System.out.println("Enter the Book Id");
        		int issueBookId=scanner.nextInt();
        		library.issueBook(issueUserId, issueBookId);
        		System.out.println("Book issued successfully");
        		break;
        case 3:
        	System.out.println("Enter the User Id");
    		int returnUserId=scanner.nextInt();
    		System.out.println("Enter the Book Id");
    		int returnBookId=scanner.nextInt();
    		library.returnBook(returnUserId, returnBookId);
    		System.out.println("Book returned by user successfully");
    		break;
        case 4:
        		System.out.println("Exit it Successfully");
        		break;
        default:
        		System.out.println("Invalid choice");
        		
        }
	}while(choice !=4);
	scanner.close();
	
}
}
