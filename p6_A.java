package assignment5;

import java.util.*;
public class p6_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of line: ");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++)
		{

		for(int j = 1;j<=i;j++)
		{
		System.out.print("* ");
		}
		System.out.println();
		}
	}

}

//Enter the number of line: 
//5
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
