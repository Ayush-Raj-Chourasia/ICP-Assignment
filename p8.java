package assignment5;
import java.util.*;
public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
		for(int j = 1;j<=i;j++)
		{
		sum += j;
		}
		}
		System.out.println(sum);
	}

}


//Enter the number of terms: 
//10
//220
