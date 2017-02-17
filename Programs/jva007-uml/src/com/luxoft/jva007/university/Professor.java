package com.luxoft.jva007.university;


public class Professor implements Person {
	
	private String surname;
    private String firstName;
    private int age;
    private Speciality speciality;
    
	public static enum Speciality {
        Mathematics,
        Automatic_Control,
        Computer_Science
    }
	
	public Professor(String surname, String firstName, int age, Speciality speciality) {
		this.surname = surname;
		this.firstName = firstName;
		this.age = age;
		this.speciality = speciality;
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
    public int getAge() {
        return age;
    }
    
    public Speciality getSpeciality() {
		return speciality;
	}
    
    @Override 
    public String toString(){
    	StringBuilder sb = new StringBuilder();
    	sb.append("Prof. ")
    	  .append(firstName)
    	  .append(" ")
    	  .append(surname);
    	return sb.toString();
    }

}
