package com.luxoft.jva007.university;

public class Student implements Person {
	
	private String surname;
	private String firstName;
	private int age;
	
	public Student(String surname, String firstName, int age) {
		this.surname = surname;
		this.firstName = firstName;
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
	public int getAge() {
		return age;
	}
	
	public void prepareForCourse(){
		System.out.format("%s is preparing for course", this);
	}
	
	@Override 
    public String toString(){
    	StringBuilder sb = new StringBuilder();
    	sb.append("Student ")
    	  .append(surname)
    	  .append(" ")
    	  .append(firstName);
    	return sb.toString();
    }

}
