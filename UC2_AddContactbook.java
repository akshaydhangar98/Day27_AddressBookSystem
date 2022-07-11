package AddressBook_System;

import java.util.Scanner;

class UC2_AddContactbook {
	public static void main(String args[]) {
		 UC2_AddContactbook u = new  UC2_AddContactbook();
		Scanner sc = new Scanner(System.in);
		System.out.println("1) Add Details ");
		while (true) {
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				u.add();
				break;
			}
		}
	}

	//function to add person
	private void add() {
		UC2_AddContactbook ab2 = new UC2_AddContactbook ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter firstname");
		String firstName = sc.next();
		ab2.setFirstName(firstName);

		System.out.println("Enter Lastname");
		String lastName = sc.next();
		ab2.setLastName(lastName);

		System.out.println("Enter address");
		String address = sc.next();
		ab2.setAddress(address);

		System.out.println("Enter city");
		String city = sc.next();
		ab2.setCity(city);

		System.out.println("Enter state");
		String state = sc.next();
		ab2.setState(state);

		System.out.println("Enter zip");
		int zip = sc.nextInt();
		ab2.setZip(zip);

		System.out.println("Enter Phone Number");
		long phoneNumber = sc.nextLong();
		ab2.setPhoneNumber(phoneNumber);

		System.out.println("Enter emailId");
		int EmailID = sc.nextInt();
		ab2.setID(EmailID);
		System.out.println("Data added successfully");
		System.out.println(ab2);
	}

	private void setID(int emailID) {
		
	}

	private void setPhoneNumber(long phoneNumber) {
		
	}

	private void setZip(int zip) {
		
	}

	private void setState(String state) {
			
	}

	private void setCity(String city) {
		
	}

	private void setFirstName(String firstName) {
		
	}

	private void setLastName(String lastName) {
		
	}

	private void setAddress(String address) {

	}

}