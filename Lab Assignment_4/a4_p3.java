
import java.util.Scanner;

public class a4_p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        int sum = 0;
        int count = 0;

        System.out.print("Random numbers generated are: ");

        do {
            int randomNumber = (int) (Math.random() * N) + 1;
            System.out.print(randomNumber + " ");
            sum += randomNumber;
            count++;
        } while (count < N);

        double average = (double) sum / N;

        System.out.println("\nAverage of " + N + " random numbers is: " + average);

        sc.close();
    }
}


// Enter a number: 10
// Random numbers generated are: 10 10 10 6 4 3 5 5 7 3
// Average of 10 random numbers is: 6.3
