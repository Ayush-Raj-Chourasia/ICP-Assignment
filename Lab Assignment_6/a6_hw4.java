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
        String str = scanner.nextLine();

        int count = countWords(str);

        System.out.println("Number of words in the string: " + count);
        scanner.close();
    }

    public static int countWords(String str) {
        int count= 1;
        for (int i = 0;i<str.length();i++){
            if (str.charAt(i) == ' ')
                count++;
        }
        return count;
       
    }
}


// Enter a string: The quick brown fox jumps over the lazy dog. 
// Number of words in the string: 9