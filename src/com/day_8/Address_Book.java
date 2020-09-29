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
	
//	public void editArrayList() {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the name of the person, the details of whom you want to edit: ");
//		String checkName = sc.nextLine();
//		
//		Iterator itr = arrList.iterator();
//		
//		Contacts c = (Contacts) itr.next();
//		
//		if(checkName.equals(c.getFirstName())) {
//			c.setFirstName(checkName);
//			
//			System.out.println("Enter the details below to be updated: ");
//			
//			System.out.println("Enter last name:");
//			String lastName = sc.nextLine();
//			c.setLastName(lastName);
//			
//			System.out.println("Enter address:");
//			String address = sc.nextLine();
//			c.setAddress(address);
//			
//			System.out.println("Enter city:");
//			String city = sc.nextLine();	
//			c.setCity(city);
//			
//			System.out.println("Enter state:");
//			String state = sc.nextLine();
//			c.setState(state);
//			
//			System.out.println("Enter zip:");
//			long zip = sc.nextLong();
//			c.setZip(zip);
//			
//			System.out.println("Enter 10 digit phone number without country code:");
//			long phoneNumber = sc.nextLong();
//			c.setMobileNumber(phoneNumber);
//			
//			sc.nextLine();
//			
//			System.out.println("Enter email-Id:");
//			String emailId = sc.nextLine();
//			c.setEmailId(emailId);
//			
//			System.out.println("Thank you! The details have been added successfully!");
//			System.out.println("Please wait.....");
//			
//			try
//			{
//			    Thread.sleep(4000);
//			}
//			catch(InterruptedException ex)
//			{
//			    Thread.currentThread().interrupt();
//			}
//			
//			printArrayList();
//			
//		}else {
//			System.out.println("The input name doesn't match with the database.");
//		}
//	}
}