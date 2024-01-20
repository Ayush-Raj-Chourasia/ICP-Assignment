
import java.util.Scanner;

public class a3_p9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a, b, c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int secondMax = a+b+c- max - min;

        System.out.println("Largest number: " + max);
        System.out.println("Second largest number: " + secondMax);
        sc.close();
    }
}

//Enter the value of a, b, c:
//2
//10
//5
//Largest number: 10
//Second largest number: 5