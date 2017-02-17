package com.luxoft.jva007.airport;

public class Client implements Person {
	
	private String surname;
	private String firstName;
	private String phoneNumber;
	
	public Client(String surname, String firstName, String phoneNumber){
		this.surname = surname;
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String getSurname(){
		return surname;
	}
	
	@Override
	public String getFirstName(){
		return firstName;
	}
	
	@Override
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	@Override
	public int getDiscount(int noFlights) {
		if(noFlights > 25) {
			return 30;
		}
		else if (noFlights > 15) {
			return 20; 
		}
		return 0;
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
    	sb.append("Client: ")
    	  .append(surname)
    	  .append(" ")
    	  .append(firstName)
    	  .append(", phone number: ")
    	  .append(phoneNumber);
    	  
    	return sb.toString();
	}
}
