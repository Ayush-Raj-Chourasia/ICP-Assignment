import java.util.Scanner;

public class q10c{

    public static int numberOfDaysInAYear(int year){
        if (year%4==0 && year%100 !=0 || year%400 == 0){
            return 366;
        }
        else
            return 365;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.println("No. of days in year: "+ numberOfDaysInAYear(year));
        sc.close();
    }
}