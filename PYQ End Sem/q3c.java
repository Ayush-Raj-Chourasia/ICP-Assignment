import java.util.Scanner;

public class q3c{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter today's day no. starts 0 with Sunday: ");
        int n = sc.nextInt();
        System.out.print("Enters no. of days in future: ");
        int day = sc.nextInt();
        int m = (n+day)%7;
        switch(m){
            case 0 : System.out.println("Sunday");break;
            case 1 : System.out.println("Monday");break;
            case 2 : System.out.println("Tuesday");break;
            case 3 : System.out.println("Wednesday");break;
            case 4 : System.out.println("Thursday");break;
            case 5 : System.out.println("Friday");break;
            case 6 : System.out.println("Saturday");break;
        }
        sc.close();

        
    }
 }