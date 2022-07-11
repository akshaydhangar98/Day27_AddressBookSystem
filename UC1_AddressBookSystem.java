package AddressBook_System;

import java.util.Scanner;

public class UC1_AddressBookSystem{
	
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
long zip;
	String phoneNumber;
	String email;
void addPerson() {
	Scanner scan=new Scanner(System.in);
	System.out.println("First Name :");
	this.firstName=scan.nextLine();
	System.out.println("Last Name :");
	this.lastName=scan.nextLine();
	System.out.println("Enter the address :");
	this.address=scan.nextLine();
	System.out.println("Enter city : ");
	this.city=scan.nextLine();
	System.out.println("Enter state : ");
	this.state=scan.nextLine();
	System.out.println("Enter zip : ");
	this.zip=scan.nextLong();
	System.out.println("Enter Phone Number : ");
	this.phoneNumber=scan.nextLine();
	System.out.println("Enter Email : ");
	this.email=scan.nextLine();
	
}
public static void main(String[] args) {
	
	System.out.println("Welcome to Address Book Program ");
    UC1_AddressBookSystem contact=new UC1_AddressBookSystem();
    contact.addPerson();
    
    
}

}