package com.luxoft.jva007.restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Restaurant {
	
	private String name;
	private int numberOfTables;
	private List<Client> clients = new ArrayList<Client>();
	private List<Employee> employees = new ArrayList<Employee>();
	
	public Restaurant (String name, int numberOfTables) {
		this.name = name;
		this.numberOfTables = numberOfTables;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNumberOfTables() {
		return numberOfTables;
	}
	
	public List<Client> getClientsList() {
		return Collections.unmodifiableList(clients);
	}
	
	public boolean addClient(Client client) {
		return clients.add(client);
	}
	
	public List<Employee> getEmployeesList() {
		return Collections.unmodifiableList(employees);
	}
	
	public boolean addEmployee(Employee employee) {
		return employees.add(employee);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Restaurant name: ")
		  .append(name);
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		
		Employee employee = new Employee("Smith", "John");
		Client client = new Client("Johnson", "Michael", 278);   
		
		Restaurant restaurant = new Restaurant("Sierra Mar", 2000);
		
		restaurant.addClient(client);
		restaurant.addEmployee(employee);
		
		System.out.println(restaurant);
		
		employee.confirmReservation(client);
		client.order();
		employee.serve(client);
		employee.bringCheck(client);
		client.payBill();
		
	}

}
