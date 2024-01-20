
import java.util.Scanner;

public class a4_p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        int num3 =num2;
        int num4 = num1;
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        
        System.out.println("GCD of " + num4 + " and " + num3 + " is " + num1);

        sc.close();

    }
}

//
//Enter the first number: 56
//Enter the second number: 98
//GCD of 56 and 98 is 14
