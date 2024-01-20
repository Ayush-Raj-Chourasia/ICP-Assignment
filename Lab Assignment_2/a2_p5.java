
import java.util.Scanner;

public class a2_p5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the hemisphere: ");
        double radius = sc.nextDouble();

        double pi = Math.PI;
        double surfaceArea = 3 * pi * radius * radius;
        double volume = (2.0 / 3.0) * pi * radius * radius * radius;

        System.out.println("The surface area of the hemisphere is " + surfaceArea);
        System.out.println("The volume of the hemisphere is " + volume);
        sc.close();

    }
}

//Enter the radius of the hemisphere: 5
//The surface area of the hemisphere is 235.61944901923448
//The volume of the hemisphere is 261.79938779914943
