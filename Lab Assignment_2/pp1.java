package assignment2;

public class pp1 {
    public static void main(String args[]) {
        int dividend = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args[1]);
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient = " + quotient + " and Remainder = " + remainder);
    }
}
