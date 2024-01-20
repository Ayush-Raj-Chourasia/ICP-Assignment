/* Design a Simple Calculator using methods in java containing the following functionalities, 
namely, with Addition, Subtraction, Multiplication, Remainder, Division and Square Root. The 
signature of the methods are given below. 
public static int additionSimple(int x, int y) 
Two inputs, x and y. Return the result of adding x to y. 
public static int subtractionSimple(int x, int y) 
Two inputs, x and y. Return the result of subtracting x from y i.e y-x. 
public static int multiplicationSimple(int x, int y) 
Two inputs, x and y. Return the result of multiplying x to y i.e. x*y. 
public static double divisionSimple(int x, int y) 
Two inputs, x and y. Return the result of dividing y by x. Please check whether 
x is zero before dividing. 
public static int remainderSimple(int n, int m) 
Please make sure that remainderSimple() takes two inputs, namely, a number 
(int) n and a number (int) m. The method should return the remainder of n 
divided by m. 
public static double squareRootSimple(int n) 
Takes one input, namely a number n, and returns the square root of the number. 
The return should be double. Please kindly make sure that the number n is 
positive*/


import java.util.Scanner;

public class a6_p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int y = scanner.nextInt();

        int resultAddition = additionSimple(x, y);
        System.out.println("Addition: " + resultAddition);

        int resultSubtraction = subtractionSimple(x, y);
        System.out.println("Subtraction: " + resultSubtraction);

        int resultMultiplication = multiplicationSimple(x, y);
        System.out.println("Multiplication: " + resultMultiplication);

        double resultDivision = divisionSimple(x, y);
        System.out.println("Division: " + resultDivision);

        int resultRemainder = remainderSimple(x, y);
        System.out.println("Remainder: " + resultRemainder);

        double resultSquareRoot = squareRootSimple(x);
        System.out.println("Square Root: " + resultSquareRoot);
        scanner.close();
    }

    public static int additionSimple(int x, int y) {
        return x + y;
    }

    public static int subtractionSimple(int x, int y) {
        return y - x;
    }

    public static int multiplicationSimple(int x, int y) {
        return x * y;
    }

    public static double divisionSimple(int x, int y) {
        if (x == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return (double) y / x;
    }

    public static int remainderSimple(int n, int m) {
        return n % m;
    }

    public static double squareRootSimple(int n) {
        if (n < 0) {
            System.out.println("Cannot calculate square root of a negative number.");
            return 0;
        }
        return Math.sqrt(n);
    }
}

// Enter the first number: 20
// Enter the second number: 30
// Addition: 50
// Subtraction: 10
// Multiplication: 600
// Division: 1.5
// Remainder: 20
// Square Root: 4.47213595499958
