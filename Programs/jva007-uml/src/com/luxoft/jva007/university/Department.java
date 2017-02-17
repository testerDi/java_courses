package com.luxoft.jva007.university;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Department {
	
	private String departmentName;
    private List<Professor> professors = new ArrayList<Professor>();
    
    public Department(String name) {
        departmentName = name;
    }
    
    public String getDepartmentName(){
    	return departmentName;
    }
    
    public List<Professor> getProfessorsList() {
		return Collections.unmodifiableList(professors);
	}
	
	public boolean addProfessor(Professor professor) {
		return professors.add(professor);
	}
	
    public String toString() {
    	StringBuilder sb = new StringBuilder();
        sb.append("Department name: ")
          .append(departmentName)
          .append(" ");
        
        for (Professor professor: professors) {
            sb.append(professor)
              .append(" ");
        }
        return sb.toString();
    }

}
