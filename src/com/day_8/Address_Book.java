package com.day_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Address_Book {
	private ArrayList<Contacts> arrList = new ArrayList<Contacts>();
	
	public void addToAddressBook(Contacts con) {
		System.out.println("arrList.contains(con) : " + arrList.contains(con));
		if(arrList.contains(con)) {
			System.out.println("Sorry! The details already exist...");
			System.exit(0);
		}
		arrList.add(con);
	}
	
	public void printArrayList() {
		System.out.println("Updated array list is: ");
		System.out.println(arrList);
	}
}