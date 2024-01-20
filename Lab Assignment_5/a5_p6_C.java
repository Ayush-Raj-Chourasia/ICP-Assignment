
import java.util.*;
public class a5_p6_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of line: ");
		int n = sc.nextInt();
		int k = 1;
		for(int i = 1;i<=n;i++){

			for(int j = 1;j<=i;j++){
				System.out.print(k+++" ");
			}
			System.out.println();

		}
		sc.close();
	}

}


//Enter the number of line: 
//6
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 
//16 17 18 19 20 21 
