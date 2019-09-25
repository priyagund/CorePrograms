package com.bridgelabz.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Address;
import com.bridgelabz.model.PersonModel;
import com.bridgelabz.services.AddressBook;
import com.bridgelabz.model.Person;
import com.bridgelazs.utility.Utility;

public class AddressBookManager {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		ArrayList<PersonModel>personList=new ArrayList<PersonModel>();
		ArrayList<Person>person=new ArrayList<Person>();
		PersonModel personlist= new PersonModel();
		AddressBook addressbook=new AddressBook();
		//personlist=mapper.readValue(new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/person.json"),PersonModel.class);
        System.out.println("AddressBook Manager");
		System.out.println("1.creat addressbook\n 2.open addressbook\n 3.save addressbook\n 4.close addressbook\n 5.exit");
		System.out.println("enter your choice");
		int choice=Utility.getInt();
		
		switch(choice) 
		{
		case 1:// creat addressbook
		        
			   
			   System.out.println("enter addressbook name");
			   String addName=Utility.getStr();
			   mapper.writeValue(new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/"+addName+".json"),AddressBook.class); 
		       System.out.println("enter how many person add in addressbook");
		       int noOfPerson=Utility.getInt();
		       int personumber=1;
		       
		       
		       while(noOfPerson>0) 
		       {
		    	  System.out.println("enter person"+personumber+" details");
		    	  Person personDetails=addressbook.addPerson();
		    	   noOfPerson--;
		    	   personumber++;
		           
		    	  mapper.writeValue(new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/"+addName+".json"),personlist);
		    	  person.add(personDetails);
		       }  
		       
		         
			   
		case 2:// open addressbook
			   System.out.println("open existing address book");
			   System.out.println("enter your choice");
			  int choice2=Utility.getInt();
			   
			  System.out.println("enter 1.add person\n 2.edit person\n 3.delete person \n");
			  switch(choice2)
			  {
			    
			  }
			  
			   
			
		case 3:// save addressbook		
		
		case 4: //closed addressbook
		
		case 5://exit
		}
		

		
		
		
        
       
		
		
	}
}
