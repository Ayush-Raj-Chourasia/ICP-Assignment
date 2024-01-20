// Some websites impose certain rules for passwords.  
// Write a method that checks whether a string is a valid password. Suppose the password rules 
// are as follows: 
// A password must have at least eight characters. 
// A password consists of only letters and digits. 
// A password must contain at least two digits.  
// Write a program that prompts the user to enter a password and displays Valid Password if the 
// rules are followed or Invalid Password otherwise. 


import java.util.Scanner;

public class a6_p9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a password
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        // Check if the entered password is valid
        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        // Rule: A password must have at least eight characters.
        if (password.length() < 8) {
            return false;
        }

        // Rule: A password consists of only letters and digits.
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (!Character.isLetterOrDigit(currentChar)) {
                return false;
            }
        }

        // Rule: A password must contain at least two digits.
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isDigit(currentChar)) {
                digitCount++;
            }
        }

        return digitCount >= 2;
    }
}


// Enter a password: password12345
// Valid Password