import java.util.*;
public class prime_check {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        for(i=2;i<n/2;i++){
            if(prime(i) && prime(n-i))
                System.out.println(n+" can be written as "+i+"+"+(n-i));
        sc.close();        
        }
    }
    public static boolean prime(int n)
    {
        int i,a=0;
        for(i=2;i<n;i++)
        {
            if(n%i == 0)
                a++;
        }
        if(a == 0)
            return true;
        else 
            return false;
   
    }
}