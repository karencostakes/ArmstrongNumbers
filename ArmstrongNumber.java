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
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number");
		int n = sc.nextInt();
		int copy = n;
		int sum=0;
		while(copy!=0)
		{
			int d = copy % 10;
			sum = sum + (int)Math.pow(d,3);
			copy = copy / 10;
		}
		if(sum == n)
			System.out.print("Armstrong Number");
		else
System.out.print("Not Armstrong Number");
	}

}
