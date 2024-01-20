// Write a Java method to count all words in a string. 
// Example:  
// Input the string:  
// The quick brown fox jumps over the lazy dog. 
// Expected Output: 
// Number of words in the string: 9 

import java.util.Scanner;

public class a6_hw4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int wordCount = countWords(inputString);

        System.out.println("Number of words in the string: " + wordCount);
        scanner.close();
    }

    public static int countWords(String str) {
        // Split the string using space as the delimiter
        String[] words = str.split("\\s+");

        // Return the number of words in the string
        return words.length;
    }
}


// Enter a string: The quick brown fox jumps over the lazy dog. 
// Number of words in the string: 9