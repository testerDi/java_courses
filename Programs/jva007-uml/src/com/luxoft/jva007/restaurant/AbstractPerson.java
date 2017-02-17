package com.luxoft.jva007.restaurant;

public class AbstractPerson implements Person {
	
	private String surname;
	private String firstName;
	
	public AbstractPerson(String surname, String firstName) {
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

}
