
import java.util.Scanner;
public class numberPalindrome{

    public static boolean checkPalindrome(int num){
        int a = num;
        int b = 0;
        while(a>0){
            int rem = a%10;
            b = 10*b + rem;
            a = a/10;
        }
        System.out.println(b);
        if (num == b)
            return true;
        else
            return false;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("The number is Palindrome: "+ checkPalindrome(a));
        sc.close();
    }
}