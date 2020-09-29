package com.day_8;

import java.util.ArrayList;

public class Address_Book {
	private ArrayList<Contacts> arrList = new ArrayList<Contacts>();
	
	public void addToAddressBook(Contacts con) {
		arrList.add(con);
	}
	
	public void printArrayList() {
		System.out.println("Updated array list is: ");
		System.out.println(arrList);
	}
}
