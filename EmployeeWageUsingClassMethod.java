package com.employeewagelinecomparisonusingOOPs;

public class EmployeeWageUsingClassMethod {
	static int IS_FULL_TIME =8;
	static int EMP_RATE_PER_HOUR =20;
	static int empHrs =8;
	static int empWage =20;
	void toCheckEmployeeWage() {
		// TODO Auto-generated method stub
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if(empCheck == IS_FULL_TIME) {
			empHrs =8;
		}
		else {
			empHrs =0;
			empWage = empHrs * EMP_RATE_PER_HOUR;
		} System.out.println("EmployeeDailyWage: " + empWage);


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDailyWage employeeDailyWage = new EmployeeDailyWage();
		employeeDailyWage.toCheckEmployeeWage();

	}

}
