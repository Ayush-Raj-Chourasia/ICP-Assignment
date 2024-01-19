
package assignment2;
import java.util.Scanner;

public class p2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the distance in kilometers: ");
        double kilometers = sc.nextDouble();

        double meters = kilometers * 1000;
        double feet = kilometers * 3280.8399;
        double inches = kilometers * 39370.0787;
        double centimeters = kilometers * 100000;

        System.out.println(kilometers + " km is " + meters + " meters");
        System.out.println(kilometers + " km is " + feet + " feet");
        System.out.println(kilometers + " km is " + inches + " inches");
        System.out.println(kilometers + " km is " + centimeters + " centimeters");
    }
}