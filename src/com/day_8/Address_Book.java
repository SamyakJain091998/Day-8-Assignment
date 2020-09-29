package com.day_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Address_Book {
	private ArrayList<Contacts> arrList = new ArrayList<Contacts>();
	
	public void addToAddressBook(Contacts con) {
		arrList.add(con);
	}
	
	public void printArrayList() {
		System.out.println("Updated array list is: ");
		System.out.println(arrList);
	}
	
	public void deleteArrayList() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the person, the details of whom you want to edit: ");
		String checkName = sc.nextLine();
		
		Iterator itr = arrList.iterator();
		
		Contacts c = (Contacts) itr.next();
		
		if(checkName.equals(c.getFirstName())) {
			arrList.clear();
			
			System.out.println("Thank you! The details have been deleted successfully!");
			System.out.println("Please wait.....");
			
			try
			{
			    Thread.sleep(4000);
			}
			catch(InterruptedException ex)
			{
			    Thread.currentThread().interrupt();
			}
			 
			System.out.println("ArrayList is empty ? " + arrList.isEmpty());
			System.out.print("Updated array List is: ");
			printArrayList();
			
		}else {
			System.out.println("The input name doesn't match with the database.");
		}
	}
}