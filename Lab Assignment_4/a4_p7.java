
import java.util.Scanner;

public class a4_p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for which you want to find the multiplication table: ");
        int number = sc.nextInt();

        System.out.println("The multiplication table of " + number + " is:\n");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + "x" + i + "=" + result);
        }

        sc.close();
    }
}


//Enter a number for which you want to find the multiplication table: 18
//The multiplication table of 18 is:

//18x1=18
//18x2=36
//18x3=54
//18x4=72
//18x5=90
//18x6=108
//18x7=126
//18x8=144
//18x9=162
//18x10=180

