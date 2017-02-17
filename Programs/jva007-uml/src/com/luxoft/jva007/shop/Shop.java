package com.luxoft.jva007.shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {
	
	private String name;
	private String shopAddress;
	private List<Department> departments = new ArrayList<Department>();
	private List<Customer> customers = new ArrayList<Customer>();
	
	public Shop (String name, String shopAddress) {
		this.name = name;
		this.shopAddress = shopAddress;
	}
	
	public String getName() {
		return name;
	}

	public String getShopAddress() {
		return shopAddress;
	}
	
	public List<Department> getDepartmentsList() {
		return Collections.unmodifiableList(departments);
	}
	
	public boolean addDepartment(Department department) {
		return departments.add(department);
	}
	
	public List<Customer> getCustomersList() {
		return Collections.unmodifiableList(customers);
	}
	
	public boolean addCustomer(Customer customer) {
		return customers.add(customer);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Shop name: ")
		  .append(name)
		  .append(", address: ")
		  .append(shopAddress);
		return sb.toString();
	}
	
    public static void main(String[] args) {
		
		Employee employee = new Employee("Smith", "John");
		Customer customer = new Customer("Johnson", "Michael", "0278-786-234", "Home address"); 
		
		Shop shop = new Shop("Example shop", "Shop address");
		Department department = new Department("Selling");
		
		department.addEmployee(employee);
		shop.addDepartment(department);
		shop.addCustomer(customer);
		
		System.out.println(shop);
		
		customer.order();
		employee.serve(customer);
		customer.payBill();
    }

}
