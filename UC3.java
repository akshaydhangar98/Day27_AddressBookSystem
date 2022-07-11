package AddressBook_System;

import java.util.Scanner;
public class UC3 {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    long zip;
    String phoneNumber;
    String email;
    Scanner scan=new Scanner(System.in);
    void addPerson() {
    	
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
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Address Book Program ");
       UC3 contact=new UC3 ();
       
        while(true) {
        	System.out.println("Do you want to add/edit the contact (0/1) :");
        	int input=scan.nextInt();
        	if(input==0) {
        		contact.addPerson();
        		break;
        	}
        	else if(input==1 && contact.firstName==null) {
        		System.out.println("Adressbook is empty .Please add");}
        		
        	else if(input==1) {
        		Scanner nameScan=new Scanner(System.in);
        		System.out.println("Enter the first name of the person you want to edit : ");
        		String name=nameScan.nextLine();
        		if(name.equals(contact.firstName)) {
        			contact.addPerson();
        		
        		}
        	   else {
        			System.out.println("No such person exist in the database");
        		}
        		break;
        	}		
        		
        	
        	else {
        		System.out.println("Enter the valid command");
        	}
        }
        
        
        
	}
}