// Write a method that finds the number of occurrences of a specified character in a string using 
// the following header: 
// public static int count(String str, char a)  
// For example, count ("Welcome", 'e') returns 2.  
// Write a java program that prompts the user to enter a string followed by a character and 
// displays the number of occurrences of the character in the string.

import java.util.Scanner;

public class a6_p6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character: ");
        char charToCount = scanner.next().charAt(0);

        int occurrences = count(inputString, charToCount);
        System.out.println("Number of occurrences of '" + charToCount + "' in the string: " + occurrences);
        scanner.close();
    }

    public static int count(String str, char a) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }

        return count;
    }
}


// Enter a string: Hello World 
// Enter a character: l
// Number of occurrences of 'l' in the string: 3