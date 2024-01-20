

import java.util.Scanner;

public class a4_hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (N): ");
        int N = sc.nextInt();

        int sumOfEvens = 0;
        int productOfOdds = 1;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sumOfEvens += i;
            } else {
                productOfOdds *= i;
            }
        }

        System.out.println("Sum of all even numbers = " + sumOfEvens);
        System.out.println("Product of all odd numbers = " + productOfOdds);

        sc.close();
    }
}


//Enter a number (N): 10
//Sum of all even numbers = 30
//Product of all odd numbers = 945
