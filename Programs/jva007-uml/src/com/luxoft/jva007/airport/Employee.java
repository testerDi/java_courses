package com.luxoft.jva007.airport;

public class Employee implements Person {
	
	private String surname;
	private String firstName;
	private String phoneNumber;
	
	public Employee(String surname, String firstName) {
		this.surname = surname;
		this.firstName = firstName;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public int getDiscount(int noFlights) {
		return 25;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
    	sb.append("Employee: ")
    	  .append(firstName)
    	  .append(" ")
    	  .append(surname);
    	return sb.toString();
	}

}
