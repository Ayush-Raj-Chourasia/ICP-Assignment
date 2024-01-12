package assignment5;
import java.util.*;
public class p6_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of line: ");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++)
		{

		for(int j = 1;j<=i;j++)
		{
		System.out.print(i+" ");
		}
		System.out.println();

		}
	}

}


//Enter the number of line: 
//5
//1 
//2 2 
//3 3 3 
//4 4 4 4 
//5 5 5 5 5 
