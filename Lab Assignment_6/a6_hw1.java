// Write a program to find the first non-repeated character in a given String, for example, if the 
// given String is "Java" then the first non-repeated character is "J".

import java.util.Scanner;

public class a6_hw1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        char firstNonRepeatedChar = findFirstNonRepeatedCharacter(inputString);

        if (firstNonRepeatedChar != '\0') {
            System.out.println("The first non-repeated character is: " + firstNonRepeatedChar);
        } else {
            System.out.println("No non-repeated character found in the string.");
        }
        scanner.close();
    }

    public static char findFirstNonRepeatedCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            
            // Check if the character is not repeated in the remaining part of the string
            if (str.indexOf(currentChar) == i && str.indexOf(currentChar, i + 1) == -1) {
                return currentChar;
            }
        }

        // If no non-repeated character is found, return '\0' (null character)
        return '\0';
    }
}


// Enter a string: Java
// The first non-repeated character is: J