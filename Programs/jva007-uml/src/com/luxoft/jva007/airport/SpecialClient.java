package com.luxoft.jva007.airport;

public class SpecialClient extends Client {
	
private int discount;
	
	public SpecialClient(String surname, String firstName, String phoneNumber, int discount) {
		super(surname, firstName, phoneNumber);
		this.discount = discount;
	}
	
	public int getDiscount() {
		return discount;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
    	sb.append("Client: ")
    	  .append(getSurname())
    	  .append(" ")
    	  .append(getFirstName())
    	  .append(", phone number: ")
    	  .append(getPhoneNumber())
    	  .append(", discount: ")
    	  .append(discount);
    	  
    	return sb.toString();
		
  }

}
