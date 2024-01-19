
import java.util.*;
public class hw5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n = sc.nextInt();
		int a = 0, b = 1;
		if(n==1)
			System.out.print("Series are: "+a);
		else if(n==2)
			System.out.print("Series are: "+a+", "+b);
		else{
			System.out.print("Series are: "+a+", "+b);
			int i = 3;
			while(i<=n){
				int sum = a+b;
				System.out.print(", "+sum);
				a=b;
				b=sum;
				i++;
			}
		}
		sc.close();
	}

}

//Enter the number of terms: 
//10
//Series are: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
