
/******************************************************************************
* 
 
Purpose: programm to maintain an address book. An address book holds a collection of entries, each recording a person's first and last names, address, city, state, zip, and
phone number.
*
*  @author  Priyanka gund
*  @version 1.0
*  @since   30-09-2019
*
******************************************************************************/
package com.bridgelabz.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Person;
import com.bridgelabz.services.AddressBookNew;
import com.bridgelazs.utility.OopsUtility;
import com.bridgelazs.utility.Utility;

public class AddressBookManager {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		AddressBookNew addressBook = new AddressBookNew();
		File addressbookFilename = null;

		List<Person> listOfPersons = null ;
		
		

		System.out.println("enter choice \n\n1.create addressbook\n2.open addressbook \n");
		int outerchoice = Utility.getInt();
		boolean responce=true;
		while (responce) {
			switch (outerchoice) {
			case 1:// create addressbook
				addressBook.createAddressBook();
				System.out.println("you want to add person in new addressbook press 1 otherwise press 0");
				int choice = Utility.getInt();

				if (choice == 0)
					return;

				else {
					addressBook.addPerson();
					//responce = OopsUtility.isExit();
				}
				responce=OopsUtility.isExit();
				break;

			case 2:// open addressbook
				listOfPersons=addressBook.openAddressBook();
//                if(listOfPersons==null)
//                {
//                	System.out.println("no data present in addressbook");
//                }
//                else{
                	while(responce) 
					{
						System.out.println(
								"enter choice \n\n1.add person\n2.delete person\n3.edit person\n4.sort by last name\n5.sort by zipcode\n6.Show all user of addressBook");
						int innerchoice = Utility.getInt();
						
						switch (innerchoice) {
						case 1:// add person
							addressBook.addPerson(listOfPersons);
							responce=OopsUtility.isExit();
							break;
	
						case 2: // delete person
							addressBook.deletePerson(listOfPersons);
							responce=OopsUtility.isExit();
							break;
	
						case 3:// edit person
							addressBook.editPerson(listOfPersons);
							responce=OopsUtility.isExit();
							break;
	
						case 4:// sort by last name
							addressBook.sortByLastName(listOfPersons);
							System.out.println(listOfPersons);
				            //addressBook.saveAddressBook(listOfPerson, filename);
							responce=OopsUtility.isExit();
							break;
	
						case 5: // sort by zipcode
							addressBook.sortByZipCode(listOfPersons);
							responce=OopsUtility.isExit();
							break;
	
						case 6://show all user in addressbook
							addressBook.showAllAddressBook(listOfPersons);
							responce=OopsUtility.isExit();
							break;
							
						default:
							System.out.println("you enter wrong choice");
							break;
						}
						
						
					 }
//                }
			
			}
		}

             System.out.println("thank you for being with us");
	}
}