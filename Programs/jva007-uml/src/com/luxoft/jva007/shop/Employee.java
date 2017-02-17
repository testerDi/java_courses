package com.luxoft.jva007.shop;


public class Employee implements Person {
	
	private String surname;
	private String firstName;
	
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
	
	public void serve(Customer customer) {
		System.out.format("Customer %s %s has been served by employee %s %s%n", customer.getSurname(), customer.getFirstName(), getSurname(), getFirstName());
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
