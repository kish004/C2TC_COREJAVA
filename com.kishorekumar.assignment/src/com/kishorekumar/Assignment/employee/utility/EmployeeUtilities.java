package com.kishorekumar.assignment.utility;
import com.kishorekumar.assignment.employee.Employee;
import com.kishorekumar.assignment.employee.manager;
import com.kishorekumar.assignment.employee.developer;
public class EmployeeUtilities {
 public static void printEmployeeDetails(Employee employee) {
 System.out.println("Employee Name: " + employee.getName());
 System.out.println("Employee ID: " + employee.getEmployeeId());
 System.out.println("Salary: " + employee.getSalary());
 if (employee instanceof manager) {
 manager manager = (manager) employee;
 System.out.println("Department: " + manager.getDepartment());
 } else if (employee instanceof developer) {
 developer developer = (developer) employee;
 System.out.println("Programming Language: " + developer.getProgrammingLanguage());
 }
 System.out.println();
 }
}

	


