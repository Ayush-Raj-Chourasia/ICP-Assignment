
import java.util.Scanner;

public class a4_p8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while (true){
		int computer = (int) (Math.random()*(10-1+1)+1);
		System.out.print("Guess the number : ");
		int user = sc.nextInt();
		System.out.println("Computer Guess Number : "+ computer);
		
		
		if (user == computer) {
			
			System.out.println("Good Guess");
			break;
		}
		
		else if (user>computer)
			System.out.println("Too High Guess, Try Again");
		
		else if (user<computer)
			System.out.println("Too low Guess, Try Again");
	}
	sc.close();
	}
}

// Guess the number : 3
// Computer Guess Number : 5
// Too low Guess, Try Again
// Guess the number : 3
// Computer Guess Number : 9
// Too low Guess, Try Again
// Guess the number : 3
// Computer Guess Number : 2
// Too High Guess, Try Again
// Guess the number : 3
// Computer Guess Number : 9
// Too low Guess, Try Again
// Guess the number : 3
// Computer Guess Number : 6
// Too low Guess, Try Again
// Guess the number : 3
// Computer Guess Number : 10
// Too low Guess, Try Again
// Guess the number : 3
// Computer Guess Number : 5
// Too low Guess, Try Again
// Guess the number : 3
// Computer Guess Number : 5
// Too low Guess, Try Again
// Guess the number : 3
// Computer Guess Number : 3
// Good Guess
