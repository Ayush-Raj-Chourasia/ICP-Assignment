// Write a java program to convert a decimal integer to its corresponding octal representation.

import java.util.Scanner;

public class a7_p7 {
    public static int decimalToOctal(int a){
        int octal = 0;
        int power = 0;
        int convertTo = 8;
        while(a>0){
            int rem = a%convertTo;
            octal += (int)Math.pow(10,power)*rem;
            a = a/convertTo;
            power++;
        }
        return octal;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int n = sc.nextInt();
        System.out.println("Decimal to octal number: " + decimalToOctal(n));
        sc.close();
    }
}


// Enter the decimal number: 100
// Decimal to octal number: 144