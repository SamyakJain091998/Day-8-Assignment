package com.day_8;

import java.util.Scanner;

public class UC2 {
	
	public static void main(String[] args) {
		System.out.println("Enter the details as specified below.");
		UC2 u = new UC2();
		u.Details();
	}

	private void Details() {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter first name:");
		String firstName = sc.nextLine();
		
		System.out.println("Enter last name:");
		String lastName = sc.nextLine();
		
		System.out.println("Enter address:");
		String address = sc.nextLine();
		
		System.out.println("Enter city:");
		String city = sc.nextLine();	
		
		System.out.println("Enter state:");
		String state = sc.nextLine();
		
		System.out.println("Enter zip:");
		long zip = sc.nextLong();
		
		System.out.println("Enter 10 digit phone number without country code:");
		long phoneNumber = sc.nextLong();

		sc.nextLine();
		
		System.out.println("Enter email-Id:");
		String emailId = sc.nextLine();
		
		Contacts c = new Contacts(firstName, lastName, address, city, state, zip, phoneNumber, emailId);
		
		Address_Book ab = new Address_Book();
		System.out.println("Thank you! The details have been added successfully!");
		
		try
		{
		    Thread.sleep(2000);
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}

		ab.addToAddressBook(c);
		ab.printArrayList();				
	}
}