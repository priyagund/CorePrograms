package com.bridgelabz.model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public interface ImplPerson {
 public void addPerson(List<Person> listOfPerson);
 public void editPerson(List<Person> person);
 public void deletePerson(List<Person> person);
 public void sortByLastName(List<Person> person);
 public void sortByZipCode(List<Person> person);
 public void createAddressBook() throws JsonGenerationException, JsonMappingException, IOException;
 public List<Person> openAddressBook() throws JsonParseException, JsonMappingException, IOException;
 public void saveAddressBook(List<Person> listOfPerson,File filename) throws JsonParseException, JsonMappingException, IOException;
 public void showAllAddressBook(List<Person> listOfPerson);
}