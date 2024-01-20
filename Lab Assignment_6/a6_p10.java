// Write a java program to calculate the area of triangle, square, circle, rectangle by using method 
// overloading.

import java.util.Scanner;

public class a6_p10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Rectangle");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        double area;

        switch (choice) {
            case 1:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = calculateArea(base, height);
                break;

            case 2:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                area = calculateArea(side);
                break;

            case 3:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = calculateArea(radius);
                break;

            case 4:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                area = calculateArea(length, width);
                break;

            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                return;
        }

        System.out.println("Area: " + area);
        scanner.close();
    }

    // Calculate area of a triangle
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Calculate area of a square
    public static double calculateArea(double side) {
        return side * side;
    }

    // Calculate area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Calculate area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }
}


// Choose a shape to calculate area:
// 1. Triangle
// 2. Square
// 3. Circle
// 4. Rectangle
// Enter your choice (1-4): 2
// Enter the side length of the square: 10
// Area: 100.0