
import java.util.*;
public class a5_hw3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double sum=0.0d;
		System.out.println("Enter the value of x: ");
		int x=sc.nextInt();
		System.out.println("Enter a number of terms: ");
		int n=sc.nextInt();
		int p = 1;
		double r = Math.toRadians(x);
		for(int i = 1;i<=n;i++){
			int f = 1;
			for(int j=p;j>=1;j--){
				f *=j;
			}
			double power = Math.pow(r, p);
			if(i%2==0){
				sum = sum - power/f;
			}
			else{
				sum = sum + power/f;
			}
			p +=2;
		}
		System.out.println("sin ("+x+") = "+sum);
		sc.close();
	}

}


//Enter the value of x: 
//60
//Enter a number of terms: 
//10
//sin (60) = 0.8660253739422824