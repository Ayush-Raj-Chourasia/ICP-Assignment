import java.util.Scanner;

public class q7a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        int max = Math.max(x, y);
        int min = Math.min(x,y);
        int rem = 0;
        do{
            rem = max%min;          // 98  =  56 x 1 + 42
            max = min;              // max    min      rem
            min = rem;
        }
        while (rem>0);
        System.out.println("GCD "+max);
        sc.close();
    }
}