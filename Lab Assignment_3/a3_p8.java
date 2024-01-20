
import java.util.Scanner;

public class a3_p8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x-coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y-coordinate: ");
        int y = sc.nextInt();

        
        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("Y-axis");
        } else if (y == 0) {
            System.out.println("X-axis");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrant I");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrant II");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrant III");
        } else {
            System.out.println("Quadrant IV");
        }
        sc.close();
    }
}

//Enter x-coordinate: -1
//Enter y-coordinate: 0
//X-axis

