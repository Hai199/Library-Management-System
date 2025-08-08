package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.abstracts.Person;
import com.interfaces.Barrowble;
import com.pojo.Book;
//Here is the class using the common characteristics and additional features
//this class must define method body like business logic
public class User extends Person implements Barrowble {
public List<Book>barrowBookes;
public User(int userId,String name) {
	super(userId,name);
	barrowBookes=new ArrayList<>();
}

@Override
public void barrowBook(Book book) {
	barrowBookes.add(book);
	book.issuedBook();
}

@Override
public void returnBook(Book book) {
	barrowBookes.remove(book);
	book.returnBook();
	
}

@Override
public List<Book> getBarrowedBookes() {
	
	return barrowBookes;
}

@Override
public void showDetails() {
	System.out.println("user id :"+id +", Name :"+name);
}
}
