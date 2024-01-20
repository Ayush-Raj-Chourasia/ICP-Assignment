import java.util.Scanner;

public class a3_p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1 , max = 9;
        // Generate a random number between 1 and 9 for the computer's guess
        int computerGuess = (int) (Math.random() *(max - min +1)) + 1;

        System.out.print("Enter user number (between 1 and 9 inclusive): ");
        int userGuess = sc.nextInt();

        System.out.println("Computer guesses: " + computerGuess);

        if (userGuess == computerGuess) {
            System.out.println("You got it right");
        } else if (userGuess == computerGuess + 1 || userGuess == computerGuess - 1) {
            System.out.println("Almost got it");
        } else {
            System.out.println("You got it wrong");
        }

        sc.close();
    }
}


//Enter user number (between 1 and 9 inclusive): 6
//Computer guesses: 3
//You got it wrong
