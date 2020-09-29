package com.day_8;

import java.util.Scanner;

public class UC4 {
	
	public static Address_Book ab = new Address_Book();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details as specified below.");
		UC4 u = new UC4();
		u.Details();
		System.out.println("Do you want to delete the person details ? Press 'Y' (case INSENSITIVE) for yes or any other key for no..");
		char ch = sc.next().charAt(0);
		
		if(ch == 'Y' || ch == 'y') {
			ab.deleteArrayList();
		}else {
			System.out.println("Thank you! You may exit now.");
		}
	}

	private static void Details() {
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
		
		System.out.println("Thank you! The details have been added successfully!");
		System.out.println("Please wait.....");
		
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