# Library-Management-System
A simple Java console application that simulates a basic library system using core Object-Oriented Programming (OOP) concepts.

# Features
Add books to the library ,
Register users ,
Issue books to users ,
Return books from users ,
View all available/issued books

# OOP Concepts Demonstrated
| Concept                  | How it's used                                            |
| ------------------------ | -------------------------------------------------------- |
| **Abstraction**          | `Person` is an abstract class                            |
| **Interface**            | `Borrowable` defines a contract for book management      |
| **Encapsulation**        | Fields in all classes are `private` with getters/setters |
| **Inheritance**          | `User` extends `Person`                                  |
| **Polymorphism**         | `showDetails()` is overridden in `User`                  |
| **HAS-A**                | `User` has a list of `Book`s                             |
| **IS-A**                 | `User` is a `Person`                                     |
| **Constructor Chaining** | `User` constructor calls `Person` constructor            |
| **Dynamic Binding**      | Method overriding is resolved at runtime                 |

# Project Structure
LibraryManagement/
├── Book.java
├── Person.java          # Abstract class
├── Borrowable.java      # Interface
├── User.java            # Extends Person, implements Borrowable
├── LibraryImpl.java
└── LMSTest.java            # Main method with menu

# Technologies Used
Java (JDK 8 or higher) ,
SpringToolSuite ,
Command Prompt

# How to Run
Clone the repo or download the files.
Open in your IDE or compile using terminal:
javac *.java
java Main .
Use the console menu to test all features.

# Sample Data
The program includes sample books and users:
  library.addBooks(new Book(1,"Adventures of Tom Sawyer"," Mark Twain"));
	library.addBooks(new Book(2,"Agni Veena","Kazi Nasrul Islam"));
	library.addBooks(new Book(3,"Ben Hur"," Lewis Wallace"));
	library.addBooks(new Book(4,"Baburnama","Babur"));
	library.registerUser(new User(1236,"kobal"));
	library.registerUser(new User(2341,"binkel"));
 
