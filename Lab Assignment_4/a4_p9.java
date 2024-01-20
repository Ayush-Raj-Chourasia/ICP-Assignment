
import java.util.Scanner;

public class a4_p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();

        int result = 0;
        int multiplier = 1;

        while (number > 0) {
            int digit = number % 10;
            if (digit != 0) {
                result += digit * multiplier;
                multiplier *= 10;
            }
            number /= 10;
        }

        System.out.println("After removing 0 from number ,the new number is " + result + ".");

        sc.close();
    }
}


//Enter an integer number: 1002004
//After removing 0 from number ,the new number is 124.
