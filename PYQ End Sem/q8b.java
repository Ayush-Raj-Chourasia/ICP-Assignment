import java.util.Scanner;

public class q8b {
    public static boolean checkNeon(int n){
        int num = n*n;
        int sum = 0;
        while(num>0){
            sum+= num%10;
            num = num/10;
        }
        if (n==sum)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = sc.nextInt();
    boolean ch = checkNeon(n);
    if (ch)
        System.out.println("Neon Number");
    else
        System.out.println("Not Neon Number");
    sc.close();
    }
}
