package com.bridgelabz.model;

public class Appointment 
{
 private String patientid;
 private int doctorid;
 private int oppointmentid;
 private String oppointmentdate;
public String getPatientid() {
	return patientid;
}
public void setPatientid(String patientid) {
	this.patientid = patientid;
}
public int getDoctorid() {
	return doctorid;
}
public void setDoctorid(int doctorid) {
	this.doctorid = doctorid;
}
public int getOppointmentid() {
	return oppointmentid;
}
public void setOppointmentid(int oppointmentid) {
	this.oppointmentid = oppointmentid;
}
public String getOppointmentdate() {
	return oppointmentdate;
}
public void setOppointmentdate(String oppointmentdate) {
	this.oppointmentdate = oppointmentdate;
}

}