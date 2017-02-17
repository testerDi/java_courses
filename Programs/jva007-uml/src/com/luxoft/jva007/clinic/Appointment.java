package com.luxoft.jva007.clinic;

import java.util.Date;

public class Appointment {
	private Patient  patient;
	private Doctor   doctor;
	private Date     date;
	
	public Appointment(Patient patient, Doctor doctor, Date date) {
        this.patient    = patient;
        this.doctor     = doctor;
        this.date       = date;
    }
	
	public Patient getPatient() {
		return patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public Date getDate() {
		return date;
	}
	
	@Override 
    public String toString(){
    	StringBuilder sb = new StringBuilder();
    	sb.append(date)
    	  .append(", ")
    	  .append(doctor)
    	  .append(" - ")
    	  .append(patient);
    	return sb.toString();
    }
    

}
