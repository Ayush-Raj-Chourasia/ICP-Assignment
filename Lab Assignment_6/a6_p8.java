// Write a java method to check a string is palindrome or not.

import java.util.Scanner;

public class a6_p8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        if (isPalindrome(inputString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to make the comparison case-insensitive
        str = str.toLowerCase();

        // Remove non-alphanumeric characters
        str = str.replaceAll("[^a-z0-9]", "");

        // Check if the string is a palindrome
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}


// Enter a string: radar
// The string is a palindrome.