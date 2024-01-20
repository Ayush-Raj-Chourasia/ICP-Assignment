/*  Write the methods with the following headers  
// Return the reversal of an integer. Example: reverse (456), returns 654 
public static int reverse(int number)  
// Return true if number is a palindrome 
public static boolean isPalindrome(int number)  
Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is 
the same as itself. Write a java program that prompts the user to enter an integer and reports whether the integer is a palindrome.*/


import java.util.Scanner;

public class a6_p3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        if (isPalindrome(userInput)) {
            System.out.println(userInput + " is a palindrome.");
        } else {
            System.out.println(userInput + " is not a palindrome.");
            scanner.close();
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}


// Enter an integer: 1221
// 1221 is a palindrome.