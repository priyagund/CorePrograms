package com.bridgelabz.oops;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Address;
import com.bridgelabz.model.AddressBook;
import com.bridgelabz.model.Person;
import com.bridgelazs.utility.Utility;

public class AddressBookManager {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		AddressBook addressbook = new AddressBook();
		
		ArrayList<Person> person = new ArrayList<Person>();

		// add first person in address book

		Person person1 = new Person();
		String firstname = "priya";
		person1.setName(firstname);
		String lastname = "Gund";
		person1.setLastname(lastname);
		String phoneno="7066323266";
		person1.setPhoneno(phoneno);
		
		Address address = new Address();

		String state = "Maharastra";
		address.setState(state);
		String city = "mumbai";
		address.setCity(city);
		String zip = "412207";
		address.setZip(zip);

		person1.setAddress(address);
        person.add(person1);
        
        //add second person in address book
        Person person2 = new Person();
		String firstname2 = "vaishnvi";
		person2.setName(firstname2);
		String lastname2 = "Savant";
		person2.setLastname(lastname2);
		String phoneno2="9284755415";
		person2.setPhoneno(phoneno2);
		
		Address address1 = new Address();
		String state2 = "Maharastra";
		address1.setState(state);
		String city2 = "pune";
		address1.setCity(city2);
		String zip2 = "412208";
		address1.setZip(zip2);

		person2.setAddress(address1);
        person.add(person2);
        
        
        // add third person inaddress book
        Person person3 = new Person();
        
        String firstname3="yashashri";
		person3.setName(firstname3);
		String lastname3= "jadhav";
		person3.setLastname(lastname3);
		String phoneno3="9637313118";
		person3.setPhoneno(phoneno3);
		

		Address address2 = new Address();
		String state3 = "Maharastra";
		address2.setState(state3);
		String city3 = "pune";
		address2.setCity(city3);
		String zip3 = "412209";
		address2.setZip(zip3);

		person3.setAddress(address2);
        person.add(person3);
        
        
        addressbook.setPerson(person);
        mapper.writeValue(new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/json files/state.json"),addressbook);
       
        int choice=Utility.getInt();
        
        System.out.println("enter your choice 1.for creating new addressbook\n 2.for show  existing address book");
        
        switch(choice)
        {
        	case 1: System.out.println("welcome to new address book");
        		boolean exit=false;
        		while(!exit) 
        		{
        			System.out.println("add person data in address");
        			System.out.println("enter how many person data you want to add in address book");
        	        int data=Utility.getInt();
        	        Person persons=new Person();
        	        String firstname4=Utility.getStr();
        	        persons.setName(firstname4);
        	        String lastname4=Utility.getStr();
        	        persons.setLastname(lastname4);
        	        String phoneno4=Utility.getStr();
        	        
        	        Address address3=new Address();
        	        String state4 = Utility.getStr();
        			address2.setState(state4);
        			String city4 = Utility.getStr();
        			address3.setCity(city4);
        			String zip4 = Utility.getStr();
        			address2.setZip(zip3);
        			
        			persons.setAddress(address3);
        			person.add(persons);
        			
        			System.out.println("person is added in address book");
        			System.out.println("you want to add more person 1.Yes\n 2.No");
        			if(Utility.getInt()==2)
        			exit=true;
        			
        		}
        	    
        	case 2:
        		System.out.println("welcome to address book");
        		System.out.println("enter phoneno of person you want to delete");
        		boolean isfound=false;
        		String searchphone=Utility.getStr();
        	    for(int i=0;i<person.size();i++)
        	    {   
        	    	String phone=person.get(i).getPhoneno();
        	    	if(searchphone.equals(phone))
        	    	{
        	    		person.remove(i);
        	    		 System.out.println("person data deleted");
        	    		 isfound=true;
        	    		 break;
        	    	}
        	    }
        	    
        	    if(!isfound)
        	    	System.out.println("person not found");
        	       break;
        	    
        	       
        	  
        	case 3:       
        	       
        	    System.out.println("enter person phoneno of person you want to edit data");
        	    String editno=Utility.getStr();
        	    
        	
        	
        }
        
        
        
        
        
        
       
		
		
	}
}
