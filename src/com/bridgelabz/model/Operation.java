package com.bridgelabz.model;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelazs.utility.Utility;

public class Operation 
{
	File doctorsFileName = new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/doctor.json");
	File patientsFileName = new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/patient.json");
	File appointmentFileName = new File("/home/bridgeit/Desktop/priya/Felloship/CorePrograms/files/appointment.json");
	
   List<Doctors>doctor;
   List<Patients>patient;
   List<Appointment>appointment;
   ObjectMapper objectmapper = new ObjectMapper();
   
   //constructor for write value 
   Operation() throws JsonParseException, JsonMappingException, IOException
     {
	   objectmapper.readValue(doctorsFileName,(TypeReference) doctor);
	   objectmapper.readValue(patientsFileName,(TypeReference)patient );
	   objectmapper.readValue(appointmentFileName,(TypeReference)appointment);
      }
	   
   public void searchDoctor(int searchBy) 
     {
				//String ldate = LocalDate.now().toString();
				switch (searchBy) {
				case 1:
					System.out.print("\nEnter the Doctor Name:");
					String name = Utility.getStr();
					for (Doctors doctor : doctor) {
						if (doctor.getDoctorname().equalsIgnoreCase(name)) {
							System.out.println("\ndoctor Id :" + doctor.getDoctorid());
							System.out.println("doctor Name :" + doctor.getDoctorname());
							System.out.println("Shift :" + doctor.getAvailability());
                           
							int chioce;
							System.out.println("\nWant appointment press 1 otherwise 0");
							chioce = Utility.getInt();
							if (chioce == 1) {
								//ldate = showAppointment(doctor);
							//	System.out.println("Are you want to appoint on " + ldate + " if yes press 1 otherwise 0");
								int result = Utility.getInt();
								if (result == 1) {
									makeAppointment(doctor);
								} else
									System.out.println("Thank you");
							} else {
								System.out.println("Thank You");
							}
						}
					}
					break;
      }
   
   
}

private void makeAppointment(Doctors doctor2)
{
	// TODO Auto-generated method stub
	
}


 
					

}