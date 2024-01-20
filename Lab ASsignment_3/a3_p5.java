import java.util.Scanner;

public class a3_p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = sc.nextInt();

        boolean isLeapYear = false;

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        System.out.println(year + " is a leap year: " + isLeapYear);

        sc.close();
    }
}

//Input the year: 2000
//2000 is a leap year: true
