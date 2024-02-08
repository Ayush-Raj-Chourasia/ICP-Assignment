import java.util.Scanner;

public class q7b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        
        // primes
        for(int i = x; i<y;i++){
            int count = 0;
            if (i !=0 && i!=1){
                for (int j = 2;j<=i/2;j++){
                    if(i%j==0){
                        count++;
                        break;
                    }
                }
            if (count==0)
                System.out.print(i+" ");
        }
    }
    sc.close();
    }
    
}
