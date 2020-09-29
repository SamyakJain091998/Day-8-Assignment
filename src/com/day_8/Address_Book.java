package com.day_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Address_Book {
	
	private ArrayList<ArrayList<Contacts>> arrList = new ArrayList<ArrayList<Contacts>>();
	
	public void addToAddressBook(Contacts con, ArrayList<Contacts> name1) {
		
		if(arrList.contains(name1)) {
			System.out.println("AddressBook already exists..........");
			name1.add(con);
		}
		else {
			System.out.println("Created new arrayList..........");
			ArrayList<Contacts> name = new ArrayList<Contacts>();
			name.add(con);
			arrList.add(name);
		}
	}
	
	public void printArrayList() {
		System.out.println("Updated array list is: ");
		System.out.println(arrList);
	}
}