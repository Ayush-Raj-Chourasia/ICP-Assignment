
import java.util.Scanner;

public class a4_p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();


        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.print(n + " is a perfect number");
        } else {
            System.out.print(n+" is not a perfect number");
        }

        sc.close();
    }
}

//Enter a number: 28
//28 is a perfect number.

