package AddressBook_UC12;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
	
	  private Map<String,Contact> person = new LinkedHashMap<>();     //Creating hashMap of the AddressBook

	    private static Map<String,Contact>cityName=new LinkedHashMap<>();
	    private static Map<String,Contact>stateName=new LinkedHashMap<>();
	    private  static Map<String,Contact>nameSorted= new LinkedHashMap<>();


	    /*
	     * addContact() to add new created contacts to address book
	     * */
	    public void addContact(String name, Contact c) {
	        person.put(name,c);
	    }
	    public void printContactDetails() {
	        person.entrySet().stream().forEach(System.out::println);
	    }

	    /*
	     * menu() method for showing options user has
	     * */
	    public static void menu()
	    {
	        System.out.println("Press 1 for Adding a new contact to your address book.");
	        System.out.println("Press 2 for Editing Existing contact");
	        System.out.println("Press 3 for Deleting Existing Contact");
	        System.out.println("Press 4 for viewing the contacts present");
	        System.out.println("Press 5 to view contact details by city");
	        System.out.println("Press 6 to view contact details by State");
	        System.out.println("Press 7 to view contact count by State");
	        System.out.println("Press 8 to view contact count by City");
	        System.out.println("Press 9 to view list of contacts in sorted order");
	        System.out.println("Press 10 to view list of contacts in city sorted order");
	        System.out.println("Press 11 to view list of contacts in state sorted order");
	        System.out.println("Press 12 to Quit");
	    }

	    /*
	     * haveContacts() method to return index of particular person in person array
	     * */
	    int haveContact(String s) {
	        for (int i = 0; i < person.size(); i++)
	            if (person.containsKey(s))
	                return i;

	        return -1;
	    }
	    /*
	     *editContact() to edit existing contacts
	     **/
	    public void editContact(String s) {
	        Scanner inp = new Scanner(System.in);
	        int place = haveContact(s);
	        if (place >= 0) {

	            System.out.println("Enter Last name");
	            String lname = inp.next();
	            System.out.println("Enter Phone Number");
	            int phoneNumber = inp.nextInt();
	            System.out.println("Enter City");
	            String city = inp.next();
	            System.out.println("Enter State");
	            String state = inp.next();
	            System.out.println("Enter Pin Code");
	            int pinCode = inp.nextInt();

	            Contact obj = new Contact(s, lname, phoneNumber, city, state, pinCode);


	            person.replace(s,obj);
	        } else if (place == -1) ;
	        {
	            System.out.println("\nFirst Name Not Match\n");
	        }
	    }

	    /**
	     * method for deleting contacts
	     */
	    public void deleteContact(String s) {
	        int place = haveContact(s);
	        if (place >= 0)
	            person.remove(place);
	    }

	    /*
	     * personbyCity() method for to view person by city
	     * */
	    public static void personbyCity() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Name of the City.");
	        String nameCity = scanner.next();
	        boolean value = false;
	        if (value = cityName.entrySet().stream().anyMatch(name -> name.getKey().equals(nameCity)))
	        {
	            cityName.entrySet().stream().filter(name -> name.getKey().equals(nameCity)).forEach(System.out::println);
	        }
	        else
	        {
	            System.out.println("No Contacts found on city Name");
	        }
	    }
	    /*
	     * personbyState() method for to view person by state
	     * */
	    public static void personbyState() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Name of the State.");
	        String nameState = scanner.next();
	        boolean value = false;
	        if (value = stateName.entrySet().stream().anyMatch(name -> name.getKey().equals(stateName)))
	        {
	            stateName.entrySet().stream().filter(name -> name.getKey().equals(stateName)).forEach(System.out::println);
	        }
	        else
	        {
	            System.out.println("No Contacts found on city Name");
	        }
	    }
	    /*
	     * countStatePerson() method to count person present particular state and return value
	     * */
	    public static long countStatePerson(){
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Name of the State.");
	        String nameState = scanner.next();
	        return stateName.entrySet().stream().filter(name -> name.getKey().equals(stateName)).count();
	    }
	    /*
	     * countCityPerson() method to count person present particular city and return value
	     * */
	    public static long countcityPerson(){
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Name of the City.");
	        String nameCity = scanner.next();
	        return cityName.entrySet().stream().filter(name -> name.getKey().equals(nameCity)).count();
	    }
	    /*
	    * setNameSorted() method to print person list in sorted order
	    * */
	    public void setNameSorted(){
	        person.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	    }
	    /*
	     * setCitySorted() method to print person list in sorted order
	     * */
	    public void setCitySorted(){
	        cityName.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	    }
	    /*
	     * setNameSorted() method to print person list in sorted order
	     * */
	    public void setStateSorted(){
	        stateName.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	    }
	    /*
	     * Mian function of class
	     * */
	    public static void main(String[] args) {
	        Scanner inp = new Scanner(System.in);
	        AddressBookMain obj = new AddressBookMain();
	        menu();
	        int choice = inp.nextInt();
	        while (choice != 10)
	        {
	            if (choice == 1) {
	                System.out.println("Enter First Name:");
	                String fName = inp.next();
	                if (obj.person.containsKey(fName)==true)            //Checking contact is present in the Address book or not
	                {
	                    System.out.println("Contact already present");
	                }
	                else
	                {
	                    System.out.println("Enter Last NAme");
	                    String lName = inp.next();
	                    System.out.println("Enter  phone number.");
	                    int number = inp.nextInt();
	                    System.out.println("Enter The City");
	                    String city = inp.next();
	                    System.out.println("Enter The State");
	                    String state = inp.next();
	                    System.out.println("Enter the pin code");
	                    int pinCode = inp.nextInt();

	                    obj.addContact(fName, new Contact(fName, lName, number, city, state, pinCode));
	                    obj.cityName.put(city,new Contact(fName, lName, number, city, state, pinCode));
	                    obj.stateName.put(city,new Contact(fName, lName, number, city, state, pinCode));
	                }

	            } else if (choice == 2) {

	                System.out.println("Enter the First Name of the contact you want to edit?");
	                String fName = inp.next();
	                obj.editContact(fName);
	            } else if (choice == 3) {
	                System.out.println("What is the First name of the contact you want to delete?");
	                String fName = inp.next();
	                obj.deleteContact(fName);
	            } else if (choice == 4) {
	                obj.printContactDetails();
	            }
	            else if (choice ==5)
	            {
	                personbyCity();
	            }
	            else if (choice ==6)
	            {
	                personbyState();
	            }
	            else if(choice ==7)
	            {
	                System.out.println("No of times person present in State : "+countStatePerson());
	            }
	            else if (choice ==8)
	            {
	                System.out.println("No of times person present in City : "+countcityPerson());
	            }
	            else if (choice ==9)
	            {
	                obj.setNameSorted();
	            }
	            else if (choice ==10)
	            {
	                obj.setCitySorted();
	            }
	            else if (choice ==11)
	            {
	                obj.setStateSorted();
	            }

	            menu();
	            choice = inp.nextInt();
	        }
	    }
	}

