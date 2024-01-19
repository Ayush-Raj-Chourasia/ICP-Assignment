package assignment2;

import java.util.Scanner;

public class eg1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter degree in fahrenheit ");
		double f = sc.nextDouble();
		double c = (f-32)*(5.0/9);
		System.out.println(c);
		System.out.println(5/9);
		System.out.println(5.0/9);
		
	}
}




