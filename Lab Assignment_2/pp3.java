package assignment2;

public class pp3 {
    public static void main(String args[]) {
        int minR = Integer.parseInt(args[0]);
        int maxR = Integer.parseInt(args[1]);
        int fNumber = (int)(Math.random() * (maxR - minR + 1)) + minR;
        int sNumber = (int)(Math.random() * (maxR - minR + 1)) + minR;
        int sum = sNumber + fNumber;
        System.out.println("Sum of two random integers " + fNumber + " and " + sNumber + " is " + sum);
    }
}
