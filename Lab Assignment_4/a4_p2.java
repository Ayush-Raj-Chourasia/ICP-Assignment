
import java.util.Scanner;

public class a4_p2 {
    public static void main(String[] args) {
        
       
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		int k = num;
		int sum = 0;
		while (num != 0){
			sum = sum + num%10;
			num = num/10;	
		}
		
		if (sum%9==0)
			System.out.println("The number "+ k + " is divisible by 9");
		
		else 
			System.out.println("The number "+k+" is not divisible by 9");
		
		sc.close();
    }
}


//
//Enter number: 81
//The number 81 is divisible by 9

