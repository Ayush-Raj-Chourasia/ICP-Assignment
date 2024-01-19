
import java.util.*;
public class p8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++){
			for(int j = 1;j<=i;j++){
				sum += j;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}


//Enter the number of terms: 
//10
//220
