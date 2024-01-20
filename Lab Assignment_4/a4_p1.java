
import java.util.Scanner;
public class a4_p1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.print("Enter third number: ");
		int c = sc.nextInt();
		
		int sum = 0;
		
		for (int i = a;i<=b;i = i+c) {
			System.out.print(i+" ");
			sum = sum + i;}
		
		System.out.println("\nThe sum of number displayed is "+sum);
		sc.close();
	}

}

// Enter first number: 4
// Enter second number: 15
// Enter third number: 3
// 4 7 10 13
// The sum of number displayed is 34