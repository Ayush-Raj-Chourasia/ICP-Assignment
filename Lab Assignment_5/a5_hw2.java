
import java.util.*;
public class a5_hw2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}


//Enter the number of lines: 
//5
//    * 
//   * * * 
//  * * * * * 
// * * * * * * * 
//* * * * * * * * * 
