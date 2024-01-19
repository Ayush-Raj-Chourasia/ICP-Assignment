package assignment2;

public class pp5 {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int firstNumber = Math.min(Math.min(a, b), c);
        int lastNumber = Math.max(Math.max(a, b), c);
        int middleNumber = (a + b + c) - (firstNumber + lastNumber);
        System.out.println("Ascending order is " + firstNumber + ", " + middleNumber + ", " + lastNumber);
    }
}

