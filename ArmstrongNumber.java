package GradeHistograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// An Armstrong number of 3 digit is a number for which sum of cube of
		// its digits
		// are equal to number e.g. 371 is an Armstrong number because 3*3*3 +
		// 7*7*7 + 1*1*1 = 371).
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please think of a number and we will find out if your number is an Armstrong number!");
		int testNumber = scan1.nextInt();
		int testNumberModified = testNumber;
		int sum = 0;
		String number = Integer.toString(testNumber);
		int digits = number.toString().length();

		int[] testNumberBrokenDown = new int[digits];

		for (int i = 0; i < digits; i++) {

			int testNumberDigitSeparate = testNumberModified % 10;
			testNumberModified = testNumberModified / 10;
			testNumberBrokenDown[i] = testNumberDigitSeparate;

		}

		for (int k = 0; k < digits; k++) {

			sum += Math.pow(testNumberBrokenDown[k], digits);

		}

		if (sum == testNumber)

		{
			System.out.println("You got yourself an Armstrong number!");
		} else {
			System.out.println("This is not an Armstrong number!");
		}

	}

}