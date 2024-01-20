
import java.util.Scanner;

public class a2_p6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        double timeInSeconds = sc.nextDouble();

        double distanceInFeet = 0.5 * 32.174 * timeInSeconds * timeInSeconds;

        System.out.println("Distance travelled: " + distanceInFeet);
        sc.close();
    }
}

//Enter the number of seconds: 10
//Distance travelled: 1608.7
