
import java.util.Scanner;

public class a4_p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        int p = 1;

        while (p * 3 <= N) {
            p *= 3;
        }

        System.out.println("The largest power of 3 less than or equal to " + N + " is " + p);

        sc.close();
    }
}


//Enter a number: 100
//The largest power of 3 less than or equal to 100 is 81
