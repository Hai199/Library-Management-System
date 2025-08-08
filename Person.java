package com.abstracts;
//This is the class have sharing common characteristics
public abstract class Person {
protected int id;
protected String name;
public Person(int id,String name) {
	this.id=id;
	this.name=name;
}
public abstract void showDetails();
public int getId() {
	return id;
}
public String getName() {
	return name;
}

}
