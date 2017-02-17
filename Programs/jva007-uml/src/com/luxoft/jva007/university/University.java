package com.luxoft.jva007.university;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.luxoft.jva007.university.Professor.Speciality;

public class University {
	
	private String name;
	private List<Department> departments = new ArrayList<Department>();
	
	public University(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Department> getDepartmentsList() {
		return Collections.unmodifiableList(departments);
	}
	
	public boolean addDepartment(Department department) {
		return departments.add(department);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Department department: departments) {
			sb.append(department)
			  .append("\n");
		}
		
		return sb.toString();
	}
	
	public static void main(String [] args) {
		
		University university = new University("University Politehnica Bucharest");
		Department automaticControlDepartment = new Department("Automatic Control");
		Department computerScienceDepartment = new Department("Computer Science");
		
		university.addDepartment(automaticControlDepartment);
		university.addDepartment(computerScienceDepartment);
		
		Professor professorPetrescu = new Professor("Petrescu", "Mircea", 82, Speciality.Computer_Science);
		
		computerScienceDepartment.addProfessor(professorPetrescu);
		
		System.out.println(university);
		
		Student student = new Student("Popescu", "George", 20);
		student.prepareForCourse();
		
	}
	
	

}
