package assignment2;

public class cmd3 {
    public static void main(String args[]) {
        int no = Integer.parseInt(args[0]);
        int lastD = no % 10;
        int firstD = no / 1000;
        int sum = lastD + firstD;
        System.out.println("Sum = " + sum);
    }
}

