package assignment5;
import java.util.*;
public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n = sc.nextInt();
		int a = 0, b = 1, c = 1;
		System.out.print("Series are: "+a+", "+b+", "+c);
		int i = 4;
		while(i<=n)
		{
		int sum = a+b+c;
		System.out.print(", "+sum);
		a=b;
		b=c;
		c=sum;
		i++;
		}
	}

}


//Enter the number of terms: 
//10
//Series are: 0, 1, 1, 2, 4, 7, 13, 24, 44, 81