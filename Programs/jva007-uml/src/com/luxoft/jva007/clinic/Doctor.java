package com.luxoft.jva007.clinic;

import java.util.List;

public class Doctor implements Person {
	
	private String surname;
    private String firstName;
    private String cnp;
    private int age;
    private Specialization specialization;
    private Clinic clinic;

    public static enum Specialization {
        Cardiology,
        Pediatry
    }

	public Doctor(String surname, String firstName, String cnp, int age, Specialization specialization, Clinic clinic) {
        this.surname        = surname;
        this.firstName      = firstName;
        this.cnp            = cnp;
        this.age            = age;
        this.specialization = specialization;
        this.clinic         = clinic;
    }

    public void participateToAppoinments(){
        List<Appointment> appList = clinic.getAppointmentList();
        
        for (Appointment entry : appList){
            System.out.println(entry.getPatient().getSurname());
        }
        
    }
    
    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getCnp() {
        return cnp;
    }

    @Override
    public int getAge() {
        return age;
    }

    public Specialization getSpecialization() {
        return specialization;
    }
    
    @Override 
    public String toString(){
    	StringBuilder sb = new StringBuilder();
    	sb.append("Dr. ")
    	  .append(firstName)
    	  .append(" ")
    	  .append(surname);
    	return sb.toString();
    }

    
}
