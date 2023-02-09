package com.employeewagelinecomparisonusingOOPs;
import java.util.Scanner;

public class LineComparisonLengthOfLine {
	void length(double x1, double x2, double y1, double y2) {
		double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Legth of line: " +length);
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x1, x2, y1, y2;
		System.out.println("Enter the value of ( x1 y1)(x2 y2):");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();
		LineComparisonLengthOfLine linecomparison = new LineComparisonLengthOfLine();
		linecomparison.length(x1, x2, y1, y2);
	}


}
