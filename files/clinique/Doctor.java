

/******************************************************************************
* 
 
Purpose:  doctor model 
*
*  @author  Priyanka gund
*  @version 1.0
*  @since   13-09-2019
*
******************************************************************************/package com.bridgelabz.clinique;
import java.util.ArrayList;

public class Doctor 
{
	private String name;
	private String id;
	private String specialization;
	private String availability;
	private int numberOfAppointments;
	private ArrayList<Appointment> appointments;
	boolean isfull;
	
	public boolean isIsfull() {
		return isfull;
	}
	public void setIsfull(boolean isfull) {
		this.isfull = isfull;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public int getNumberOfAppointments() {
		return numberOfAppointments;
	}
	public void setNumberOfAppointments(int numberOfAppointments) {
		this.numberOfAppointments = numberOfAppointments;
	}
	public ArrayList<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(ArrayList<Appointment> appointments) {
		this.appointments = appointments;
	}
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", id=" + id + ", specialization=" + specialization + ", availability="
				+ availability + ", numberOfAppointments=" + numberOfAppointments + ", appointments=" + appointments
				+ "]";
	}
	
}
