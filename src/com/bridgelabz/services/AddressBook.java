package com.bridgelabz.services;

import com.bridgelabz.model.Address;
import com.bridgelabz.model.Person;
import com.bridgelazs.utility.Utility;

public class AddressBook
{


	public static Person addPerson()
	{    Person person=new Person();
	     Address address=new Address();
		System.out.println("enter first name");
		person.setName(Utility.getStr());
		System.out.println("enter last name");
		person.setLastname(Utility.getStr());
		System.out.println("enter phone number");
		person.setPhoneno(Utility.getStr());
		System.out.println("enter state name");
		address.setState(Utility.getStr());
		System.out.println("enter city name ");
		address.setCity(Utility.getStr());
		System.out.println("enter zip code");
		address.setZip(Utility.getStr());
		person.setAddress(address);
		System.out.println(person);
		return person;
		
	}
	
}
