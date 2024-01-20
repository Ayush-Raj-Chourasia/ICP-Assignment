
import java.util.Scanner;

public class a4_p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= power; ++i) {
            result *= base;
        }

        System.out.println(base + " to the power " + power + " is: " + result);

        sc.close();
    }
}


//Enter the base: 5
//Enter the power: 4
//5 to the power 4 is: 625



