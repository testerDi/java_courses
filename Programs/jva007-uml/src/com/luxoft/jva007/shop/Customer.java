package com.luxoft.jva007.shop;

public class Customer implements Person {
	
	private String surname;
	private String firstName;
	private String phoneNumber;
	private String deliveryAddress;

	public Customer(String surname, String firstName, String phoneNumber, String deliveryAddress) {
        this.surname = surname;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.deliveryAddress = deliveryAddress;        
    }
	
	@Override
	public String getSurname() {
		return surname;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	
	public void order() {
		System.out.format("%s has ordered something%n", this);
	}
	
	public void payBill()	{
		System.out.format("%s has payed the bill%n", this);
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
    	sb.append("Customer: ")
    	  .append(firstName)
    	  .append(" ")
    	  .append(surname)
    	  .append(", phone number: ")
    	  .append(phoneNumber)
    	  .append(", delivery address: ")
    	  .append(deliveryAddress);
    	return sb.toString();
	}

}
