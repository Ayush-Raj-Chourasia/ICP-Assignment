
import java.util.Scanner;

public class a4_hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows (N): ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();  // Move to the next line after each row
        }

        sc.close();
    }
}


//Enter the number of rows (N): 10
//1
//121
//12321
//1234321
//123454321
//12345654321
//1234567654321
//123456787654321
//12345678987654321
//12345678910987654321

