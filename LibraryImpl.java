package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.pojo.Book;
import com.pojo.Library;

public class LibraryImpl {
	//parameters
	public List<User>user;
	public List<Book>book;
	//constructor
	public LibraryImpl() {
		user=new ArrayList<>();
		book=new ArrayList<>();}
	//here we adding list of books
	public void addBooks(Book books) {
		book.add(books);
	}
	//here we adding the list of user
	public void registerUser(User users) {
		user.add(users);
		}
	//By this method we can find book by id
	public Book findBookById(int id) {
		for(Book b:book) {
			if(b.getId()==id) {
				return b;
			}else {
				System.out.println("Book was Not Found");
			}
		}return null;
	}
	//from this we can find the user by id
	public User findUserById(int id) {
		for(User u:user) {
			if(u.getId()==id) {
				return u;
			}else {
				System.out.println("User Not Found");
			}
		}
		return null;
	}
	//Displaying all books
	public void displayAllBooks() {
		for(Book b:book) {
			System.out.println(b);
		}
	}
	//here we are issue the book
	public void issueBook(int userId,int bookId) {
		User user=findUserById(userId);
		Book book=findBookById(bookId);
		if(user==null) {
			System.out.println("user not found");
		}
		if(book==null) {
			System.out.println("book not found");
		}
		if(book.isIssued()) {
			System.out.println("The Book Allready issued");
		}else {
			user.barrowBook(book);
			System.out.println("Book is issued successfully :"+user.getName());
		}
		
	}
	//here we returning the book
	public void returnBook(int userId,int boookId) {
		User user=findUserById(userId);
		Book book=findBookById(boookId);
		if(user==null||book==null) {
			System.out.println("invalid user/book id found");
			return;
		}
		if(user.getBarrowedBookes().contains(book)) {
			user.returnBook(book);
			System.out.println("book returned successfully");
		}else {
			System.out.println("This book was not borrowed by the user");
		}
	}
}
