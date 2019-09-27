package com.bridgelabz.model;

import java.util.List;

public class PersonModel 
{
  private List<Person> person;
  private Address address;
public List<Person> getPerson() {
	return person;
}
public void setPerson(List<Person> person) {
	this.person = person;
}
@Override
public String toString() {
	return "PersonModel [person=" + person + ", address=" + address + "]";
}

  
}
