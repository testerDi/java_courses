package com.luxoft.jva007.clinic;

public class Patient implements Person {
	
	private String surname;
	private String firstName;
	private String cnp;
	private int age;
	
	public Patient(String surname, String firstName, String cnp, int age) {
        this.surname = surname;
        this.firstName = firstName;
        this.cnp = cnp;
        this.age = age;
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
    
    @Override 
    public String toString(){
    	StringBuilder sb = new StringBuilder();
    	sb.append(surname)
    	  .append(" ")
    	  .append(firstName);
    	return sb.toString();
    }

}
