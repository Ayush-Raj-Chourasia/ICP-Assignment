import java.util.Scanner;

public class q8a {
    public static int sum_Of_Digit(int n){
        int sum =0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = sc.nextInt();    
    n = sum_Of_Digit(n);
    if (n/10!=0){
        n = sum_Of_Digit(n);
    }
    System.out.println(n);
    sc.close();
    }
}
