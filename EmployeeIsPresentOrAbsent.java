package com.employeewagelinecomparisonusingOOPs;

public class EmployeeIsPresentOrAbsent {

	private static double IS_FULL_TIME = 1;

	public void empcheck1() {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is not present");
		}
	}

	public static void main ( String args[]) {
		EmployeeIsPresentOrAbsent employeeIsPresentOrAbsent = new EmployeeIsPresentOrAbsent();
		employeeIsPresentOrAbsent.empcheck1(); 
	}
}
