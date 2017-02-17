package com.luxoft.jva007.shop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Department {
	
	private String departmentName;
    private List<Employee> employees = new ArrayList<Employee>();
    
    public Department(String name) {
        departmentName = name;
    }
    
    public List<Employee> getEmployeesList() {
		return Collections.unmodifiableList(employees);
	}
	
	public boolean addEmployee(Employee employee) {
		return employees.add(employee);
	}
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Department name: ")
          .append(departmentName)
          .append("\n");
        for (Employee e: employees) {
            sb.append(e);
        }
        return sb.toString();
    }

}
