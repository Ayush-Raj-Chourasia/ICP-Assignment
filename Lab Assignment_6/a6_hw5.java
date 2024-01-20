// Write a Java method that accept three integers and check whether they are consecutive are not. 
// Return true or false. 
// Expected Output: 
// Input the first number:  15 
// Input the second number:  16 
// Input the third number:  17 
// Check whether the three said numbers are consecutive or not! 
// true


import java.util.Scanner;

public class a6_hw5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Input the third number: ");
        int num3 = scanner.nextInt();

        boolean areConsecutive = checkConsecutive(num1, num2, num3);

        System.out.println("Check whether the three said numbers are consecutive or not: " + areConsecutive);
        scanner.close();
    }

    public static boolean checkConsecutive(int num1, int num2, int num3) {
        // Check if the three numbers are consecutive
        return (num1 + 1 == num2 && num2 + 1 == num3) || (num1 - 1 == num2 && num2 - 1 == num3);
    }
}


// Input the first number: 3
// Input the second number: 4
// Input the third number: 5
// Check whether the three said numbers are consecutive or not: true