package com.luxoft.jva007.restaurant;

public class Client extends AbstractPerson {
	
	private int reservationNumber;
	private double ammountToPay;

	public Client(String surname, String firstName, int reservationNumber) {
		super(surname, firstName);
		this.reservationNumber = reservationNumber;
	}
	
	public int getReservationNumber() {
		return reservationNumber;
	}
	
	public double getAmmountToPay() {
		return ammountToPay;
	}
	
	public void setAmmountToPay(double ammountToPay) {
		this.ammountToPay = ammountToPay;
	}
	
	public void payBill()	{
		System.out.format("%s has payed %.2f%n", this, ammountToPay);
		System.out.format("%s has left%n", this);
	}
	
	public void order() {
		System.out.format("%s has arrived to the restaurant%n", this);
		System.out.format("%s has ordered something%n", this);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
    	sb.append("Client: ")
    	  .append(getSurname())
    	  .append(" ")
    	  .append(getFirstName())
    	  .append(", reservation number: ")
    	  .append(reservationNumber);
    	  
    	return sb.toString();
	}

}
