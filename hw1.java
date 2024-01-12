package assignment5;
import java.util.*;
public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n = sc.nextInt();
		for(int i = n;i>=1;i--)
		{
			for(int j=1;j<=n;j++)
			{
			if(j==i)
			System.out.print("* ");
			else
			System.out.print(j+" ");

			}
			System.out.println();
			}
		
	}

}


//Enter the number of lines: 
//5
//1 2 3 4 * 
//1 2 3 * 5 
//1 2 * 4 5 
//1 * 3 4 5 
//* 2 3 4 5 
