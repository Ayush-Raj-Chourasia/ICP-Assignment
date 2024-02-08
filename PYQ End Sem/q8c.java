import java.util.Scanner;

public class q8c {
    public static boolean checkSpy(int n){
        int sum =0;
        int product = 1;
        while(n>0){
            sum += n%10;
            product *=n%10;
            n = n/10;
        }

        if (sum==product)
            return true;
        else
            return false;


    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n = sc.nextInt();
    boolean ch = checkSpy(n);
    if (ch)
        System.out.println("Spy Number");
    else
        System.out.println("Not Spy Number");
    sc.close();
    }
    
}
