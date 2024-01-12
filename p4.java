package assignment5;

import java.util.*;
public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of m: ");
		int m = sc.nextInt();
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		for(int i = m;i<=n;i++)
		{
		long fact = 1;
		for(int j = i;j>=1;j--)
		{

		fact *=j;

		}
		System.out.println("Factorial of "+i+" is: "+fact);
		}
		}
		
	}



//Enter the value of m: 
//2
//Enter the value of n: 
//15
//Factorial of 2 is: 2
//Factorial of 3 is: 6
//Factorial of 4 is: 24
//Factorial of 5 is: 120
//Factorial of 6 is: 720
//Factorial of 7 is: 5040
//Factorial of 8 is: 40320
//Factorial of 9 is: 362880
//Factorial of 10 is: 3628800
//Factorial of 11 is: 39916800
//Factorial of 12 is: 479001600
//Factorial of 13 is: 6227020800
//Factorial of 14 is: 87178291200
//Factorial of 15 is: 1307674368000

