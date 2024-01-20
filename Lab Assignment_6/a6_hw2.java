// Write a java program to calculate the volume of sphere, cuboid and cube by using method 
// overloading. 
// Volume of a cube = s * s * s [s: Side of the cube] 
// Volume of a Sphere = 4/3 × π × r^3 [r: radius] 
// Volume of a cuboid = L × b × h [L: Length, b: Breadth, h: Height]  

import java.util.Scanner;

public class a6_hw2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate volume:");
        System.out.println("1. Cube");
        System.out.println("2. Sphere");
        System.out.println("3. Cuboid");

        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        double volume;

        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the cube: ");
                double side = scanner.nextDouble();
                volume = calculateVolume(side);
                break;

            case 2:
                System.out.print("Enter the radius of the sphere: ");
                double radius = scanner.nextDouble();
                volume = calculateVolume(radius);
                break;

            case 3:
                System.out.print("Enter the length of the cuboid: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the breadth of the cuboid: ");
                double breadth = scanner.nextDouble();
                System.out.print("Enter the height of the cuboid: ");
                double height = scanner.nextDouble();
                volume = calculateVolume(length, breadth, height);
                break;

            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                return;
        }

        System.out.println("Volume: " + volume);
        scanner.close();
    }

    // Calculate volume of a cube
    public static double calculateVolume(double side) {
        return Math.pow(side, 3);
    }

    // Calculate volume of a sphere
    public static double calculateVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Calculate volume of a cuboid
    public static double calculateVolume(double length, double breadth, double height) {
        return length * breadth * height;
    }
}


// Choose a shape to calculate volume:
// 1. Cube
// 2. Sphere
// 3. Cuboid
// Enter your choice (1-3): 1
// Enter the side length of the cube: 10
// Volume: 1000.0