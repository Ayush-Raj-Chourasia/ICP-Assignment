
import java.util.*;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Enter the last number: ");
        int last = sc.nextInt();
        System.out.print("List of prime numbers between " + first + " and " + last + " are: ");
        for (int i = first; i <= last; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count = 1;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}



//Enter the first number: 
//2
//Enter the last number: 
//7
//List of prime number between 2 and 7 are: 2 3 5 7 