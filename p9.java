package assignment5;
import java.util.*;
public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n = sc.nextInt();
		double sum = 0.0;
		for(int i=1;i<=n;i++)
		{
		sum += (1/Math.pow(i,2));
		}
		System.out.println(sum);
	}

}


//Enter the number of terms: 
//10
//1.5497677311665408
