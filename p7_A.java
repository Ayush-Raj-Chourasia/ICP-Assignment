package assignment5;
import java.util.*;
public class p7_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of line: ");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++)
		{
		for(int j = 1;j<=i;j++)
		{
		System.out.print((char)(64+j)+" ");
		}
		System.out.println();
		}
	}

}

//Enter the number of line: 
//6
//A 
//A B 
//A B C 
//A B C D 
//A B C D E 
//A B C D E F 
