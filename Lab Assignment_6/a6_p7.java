// Write java method called count accepts a string as input and returns the number of vowels in 
// it. The method header is given below. 
// public static int count(String str)  
// For example, count ("Welcome") returns 2. 

import java.util.Scanner;

public class a6_p7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        int vowelCount = count(inputString);
        
        System.out.println("Number of vowels in the string: " + vowelCount);
        scanner.close();
    }

    public static int count(String str) {
        int vowelCount = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}
