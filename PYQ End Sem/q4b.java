import java.util.Scanner;

public class q4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int num = n;
        int sum = 0;
        while(num>0){
            sum+= num%10;
            num = num/10;
        }
        if (sum%9==0)
            System.out.println("Divisible");
        else
            System.out.println("Not Divisible");
        sc.close();
    }
    
}
