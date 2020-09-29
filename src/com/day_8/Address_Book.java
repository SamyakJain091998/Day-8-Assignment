package com.day_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Address_Book {
	private ArrayList<Contacts> arrList = new ArrayList<Contacts>();
	private ArrayList<Contacts> arrCityList = new ArrayList<Contacts>();
	private ArrayList<Contacts> arrStateList = new ArrayList<Contacts>();
	
	public boolean addToAddressBook(Contacts con) {
		//System.out.println("arrList.contains(con) : " + arrList.contains(con));
		if(getArrList().contains(con)) {
			System.out.println("Sorry! The details already exist...");
			return false;
		}
		getArrList().add(con);
		return true;
	}
	
	public void printArrayList() {
		System.out.println("Updated array list is: ");
		System.out.println(getArrList());
		//System.exit(0);
	}
	
	public void printCityArrayList() {
		System.out.println("Updated city array list is: ");
		System.out.println(getCityArrList());
		//System.exit(0);
	}
	
	public void printStateArrayList() {
		System.out.println("Updated state array list is: ");
		System.out.println(getStateArrList());
		//System.exit(0);
	}
	
	public void getDetailsAccCity(String cityOfPerson) {
		Iterator itr = arrList.iterator();
		int flag = 0;
		boolean flagIndex = false;
		while(itr.hasNext()) {
			Contacts c = (Contacts) itr.next();
			if(cityOfPerson.equals(c.getCity())){
				flagIndex = true;
				arrCityList.add(c);
				System.out.print("Here's detail #" + (flag+1) + " : ");
				//System.out.println(arrList.get(flag));
				System.out.println("Printing using city array list: ");
				printCityArrayList();
				System.out.println();
			}
			flag++;
		}
		if(flagIndex == false) {
			System.out.println("Sorry! There's no detail regarding this city.");
		}
	}
	
	public void getDetailsAccState(String stateOfPerson) {
		Iterator itr1 = arrList.iterator();
		int flag1 = 0;
		boolean flagIndex1 = false;
		while(itr1.hasNext()) {
			Contacts c = (Contacts) itr1.next();
			if(stateOfPerson.equals(c.getState())){
				flagIndex1 = true;
				arrStateList.add(c);
				System.out.print("Here's detail #" + (flag1+1) + " : ");
				//System.out.println(arrList.get(flag1));
				System.out.println("Printing using state array list: ");
				printStateArrayList();
				System.out.println();
			}
			flag1++;
		}
		if(flagIndex1 == false) {
			System.out.println("Sorry! There's no detail regarding this state.");
			System.out.println("Thank you for using the address book system. Do visit again!");
			System.exit(0);;
		}
		System.out.println("Thank you for using the address book system. Do visit again!");
		System.exit(0);
	}
	
	public ArrayList<Contacts> getArrList() {
		return arrList;
	}
	
	public ArrayList<Contacts> getCityArrList() {
		return arrCityList;
	}
	
	public ArrayList<Contacts> getStateArrList() {
		return arrStateList;
	}
	
	public int getArrListSize() {
		return arrList.size();
	}
}