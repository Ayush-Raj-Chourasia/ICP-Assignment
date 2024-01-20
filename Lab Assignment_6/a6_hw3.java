// Write a Java method to display the middle character of a string. 
// Note:  
// a) If the length of the string is odd there will be one middle characters. 
// b) If the length of the string is even, then there would be two middle characters, we need 
// to print the second middle character. 
// Example:  
// Input a string: ABC 
// Expected Output: 
// The middle character in the string: B 
// Example:  
// Input a string: JAVA 
// Expected Output: 
// The middle character in the string: V 

import java.util.Scanner;

public class a6_hw3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        displayMiddleCharacter(inputString);
        scanner.close();
    }

    public static void displayMiddleCharacter(String str) {
        int length = str.length();

        if (length % 2 == 1) {
            // If the length of the string is odd
            int middleIndex = length / 2;
            char middleChar = str.charAt(middleIndex);
            System.out.println("The middle character in the string: " + middleChar);
        } else {
            // If the length of the string is even
            int middleIndex2 = length / 2;
            int middleIndex1 = middleIndex2 - 1;
            char middleChar1 = str.charAt(middleIndex1);
            char middleChar2 = str.charAt(middleIndex2);
            System.out.println("The middle characters in the string: " + middleChar1 + middleChar2);
        }
    }
}


// Enter a string: HELLO
// The middle character in the string: L