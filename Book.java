package com.pojo;

public class Book {
	//parameters
private int bookId;
private String title;
private String author;
private boolean isIssued;
//Constructor
public  Book(int id,String title,String author) {
	this.bookId=id;
	this.title=title;
	this.author=author;
	this.isIssued=false;
}
//Getters
public int getId() {
	return bookId;
}
public String getTitle() {
	return title;
}
public String getAuthor() {
	return author;
}
public boolean isIssued() {
	return isIssued;
}
//Some additional methods to issue or return books
public void issuedBook() {
	this.isIssued=true;
}
public void returnBook() {
	this.isIssued=false;
}
public String toString() {
    return "[" + bookId + "] " + title + " by " + author + (isIssued ? " (Isbsued)" : " (Available)");
}
}
