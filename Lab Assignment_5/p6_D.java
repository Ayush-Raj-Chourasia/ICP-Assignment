
import java.util.*;
public class p6_D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of line: ");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();

		}
		sc.close();
	}
}

//Enter the number of line: 
//6
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 
//1 2 3 4 5 6 