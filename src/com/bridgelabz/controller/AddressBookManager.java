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
import com.bridgelabz.services.*;
public class AddressBookManager {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		//ArrayList<PersonModel>personList=new ArrayList<PersonModel>();
		ArrayList<Person>person=new ArrayList<Person>();
		PersonModel personlist= new PersonModel();
		AddressBook addressbook=new AddressBook();
		//personlist=mapper.readValue(new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/person.json"),PersonModel.class);
        System.out.println("AddressBook Manager");
		System.out.println("1.creat addressbook\n2.open addressbook\n3.save addressbook\n4.exit");
		System.out.println("enter your choice");
		int outerchoice=Utility.getInt();
		
		switch(outerchoice) 
		{
	      case 1:// creat addressbook
		 System.out.println("creat new addressbook");
		 AddressBook.creatAddressBook();
		 System.out.println("you want to add person in new addressbook then enter 1 otherwise enter 0");
	     int choice=Utility.getInt();
		 Person person1;
		 if(choice==1)
			 addressbook.addPerson();
		 else
			 break;
		 
		
          break;
		 					
	     case 2: System.out.println("open addressbook");  
			 AddressBook.openAddressBook();
		     
			 System.out.println("enter 1.add person\n2.edit person\n3.delete person\n4.sort person");
			     int innerchoice=Utility.getInt();
			     while(innerchoice==1)
			     {
					switch(innerchoice)
				      {
						case 1://add person
							    System.out.println("enter how many person you want to add");	   
							    addressbook.addPerson();
							   // person.add(addressbook.addPerson());
							      break;
							    	   
						case 2://edit person
							    addressbook.editperson();
							    break;
							       
						 case 3://delete person
							    addressbook.deletePerson();
							    break;
							    	 
						  case 4://sort person
							      addressbook.sortByZip();
							      break;
							    	 
						   case 5://sort by lastname
							      ArrayList<Person>p=addressbook.sortByLastName();
							      for(int i=0;i<p.size();i++)
							      {
							    	  System.out.println(p.get(i).getName()+"\t"+p.get(i).getLastname()+"\t"+p.get(i).getPhoneno());
							      }
							      
							    	 
							default:
							      System.out.println("you enter wrong choice");
								   break;
							  }  
							   System.out.println("do you want perform any operation enter 1 otherwise 0");
								  
							      innerchoice=Utility.getInt();   
			                }	      
		
		       
		case 3:System.out.println("save address book");	
		personlist.setPerson(person);
	    AddressBook.saveAddressBook();   
		   break;
	     }
		        
	     
	   }
	
}
