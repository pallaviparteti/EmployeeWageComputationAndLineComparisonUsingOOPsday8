package com.employeewagelinecomparisonusingOOPs;

public class PartTimeEmployeeWage {
	static int IS_PART_TIME =8;
	static int IS_FULL_TIME =2;
	static int EMP_RATE_PER_HOUR =20;
	static int empHrs = 10;
	static int empWage =20;

	public static void toCheckPartTimeEmployeeWage() {
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if(empCheck == IS_PART_TIME) {
			empHrs =4;
		}
		else if (empCheck == IS_FULL_TIME){
			empHrs =8;
		}
		else {
			empHrs =0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;

		System.out.println("Part time employee wage: " + empWage);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		toCheckPartTimeEmployeeWage();
}

}



