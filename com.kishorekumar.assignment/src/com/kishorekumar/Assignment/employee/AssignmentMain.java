package com.kishorekumar.assignment.employee;
import com.kishorekumar.assignment.employee.manager;
import com.kishorekumar.assignment.employee.developer;
import com.kishorekumar.assignment.utility.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		manager manager = new manager("John", 101, 90000, "Sales");
		 developer developer = new developer("Alice", 102, 80000, "Java");
		 EmployeeUtilities.printEmployeeDetails(manager);
		 EmployeeUtilities.printEmployeeDetails(developer);
		// TODO Auto-generated method stub

	}

}
