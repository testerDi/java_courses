package com.luxoft.jva007.clinic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class MedLife implements Clinic {
	
	private List<Appointment> appointments = new ArrayList<Appointment>();

    @Override
    public List<Appointment> getAppointmentList() {
        return Collections.unmodifiableList(appointments);
    }

    public boolean registerAppointment(Patient patient, Doctor doctor, Date date) {
    	return appointments.add(new Appointment(patient, doctor, date));
    }
    
    public static void main(String[] args) {
    	MedLife medLifeClinic = new MedLife();
    	Patient patient1 = new Patient("Smith", "John", "cnp1", 30);
    	Patient patient2 = new Patient("Shelley", "Mary", "cnp2", 27);
    	
    	Doctor doctor = new Doctor("Hatley", "Mark", "cnp", 50, Doctor.Specialization.Cardiology, medLifeClinic);
    	
    	
    	medLifeClinic.registerAppointment(patient1, doctor, new GregorianCalendar(2015, 4, 31, 15, 0, 0).getTime());
    	medLifeClinic.registerAppointment(patient2, doctor, new GregorianCalendar(2015, 4, 31, 16, 0, 0).getTime());
    	
    	
    	for (Appointment appointment : medLifeClinic.getAppointmentList()) {
    		System.out.println(appointment);
    	}
    }

}
