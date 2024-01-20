
import java.util.Scanner;

public class a2_p2 {

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
        sc.close();
    }
}

//Enter the distance in kilometers: 100
//100.0 km is 100000.0 meters
//100.0 km is 328083.99 feet
//100.0 km is 3937007.8699999996 inches
//100.0 km is 1.0E7 centimeters
