package com.interfaces;

import java.util.List;

import com.pojo.Book;
//From this we adding the additional features and here we can not define method body
public interface Barrowble {
void barrowBook(Book book);
void returnBook(Book book);
List<Book>getBarrowedBookes();
}
