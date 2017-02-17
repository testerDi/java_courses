package com.luxoft.jva007.restaurant;

public class Employee extends AbstractPerson {
	
	public Employee(String surname, String firstName) {
		super(surname, firstName);
	}

	public void serve(Client client) {
		System.out.format("Client %s %s has been served by employee %s %s%n", client.getSurname(), client.getFirstName(), getSurname(), getFirstName());
	}
	
	public void bringCheck(Client client) {
		client.setAmmountToPay(Math.random() * 100);
		System.out.format("%s has to pay: %.2f%n", client.getSurname(), client.getAmmountToPay());
	}
	
	public double collectBill(Client client) {
		return client.getAmmountToPay();
	}
	
	public int confirmReservation(Client client) {
		System.out.format("Send confirmation that %s %s has reserved table number %d%n", client.getSurname(), client.getFirstName(), client.getReservationNumber());
		return client.getReservationNumber();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
    	sb.append("Employee: ")
    	  .append(getSurname())
    	  .append(" ")
    	  .append(getFirstName());
    	  
    	return sb.toString();
	}

}
