
import java.util.Scanner;

public class a4_p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 1; // Sum starts with 1 as 1 is always a factor

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                sum += i;
                if (i != number / i) {
                    sum += number / i;
                }
            }
        }

        boolean a = (sum == number) && (number > 1);

        if (a) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        sc.close();
    }
}

//Enter a number: 28
//28 is a perfect number.

