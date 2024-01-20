import java.util.Scanner;

public class a3_p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = sc.nextInt();

        System.out.print("Input second number: ");
        int num2 = sc.nextInt();

        System.out.print("Input third number: ");
        int num3 = sc.nextInt();

        if (num1 < num2 && num2 < num3) {
            System.out.println("Increasing");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither Increasing nor Decreasing");
        }

        sc.close();
    }
}


//Input first number: 1
//Input second number: 1
//Input third number: 1
//Neither Increasing nor Decreasing
