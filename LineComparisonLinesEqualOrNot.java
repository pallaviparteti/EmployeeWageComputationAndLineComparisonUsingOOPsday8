package com.employeewagelinecomparisonusingOOPs;
import java.util.Scanner;

public class LineComparisonLinesEqualOrNot {
	void lineOneLineTwo(double x1, double x2, double y1, double y2, double m1, double m2, double n1, double n2) {
		double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of line 1 : " +length1);
		double length2 = Math.sqrt(Math.pow(m2 - m1, 2) + Math.pow(n2 - n1, 2));
		System.out.println("Length of line 2 : " +length2);
		if (length1 == length2) {
			System.out.println("lines are equal");
		}
		else {
			System.out.println("lines are not equal");
		}


	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x1, x2, y1, y2;
		int x3, x4, y3, y4, m1, m2, n1, n2;
		double length1, length2;
		System.out.print("Enter value of (x1 y1) (x2 y2) : ");
		x1 = scanner.nextInt();
		y1 =scanner.nextInt();
		x2 = scanner.nextInt();
		y2 =scanner.nextInt();
		System.out.print("Enter value of (m1 n1) (m2 n2) : ");
		m1 = scanner.nextInt();
		n1 = scanner.nextInt();
		m2 = scanner.nextInt();
		n2 = scanner.nextInt();

		double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		length2 = Math.sqrt(Math.pow(m2 - m1, 2) + Math.pow(n2 - n1, 2));
		System.out.println("Length of line 1 : " +length1);
		System.out.println("Length of line 2 : " +length2);
		LineComparisonLinesEqualOrNot lineComparison = new LineComparisonLinesEqualOrNot();
		lineComparison.lineOneLineTwo(x1,x2,y1,y2,m1,m2,n1,n2);
	}
}

