// A regular polygon is an n-sided polygon in which all sides are of the same length and all angles 
// have the same degree (i.e., the polygon is both equilateral and equiangular). The formula for 
// computing the area of a regular polygon is 
// Area = (𝑛 × 𝑆^2)/(4 ×tan(𝜋/n))
//  Write a method that returns the area of a regular polygon using the following header: 


public class a6_p5 {

    public static void main(String[] args) {
        // Example usage:
        int sides = 5;  // Number of sides of the polygon
        double sideLength = 7.5;  // Length of each side
        double polygonArea = area(sides, sideLength);
        
        System.out.println("The area of the regular polygon is: " + polygonArea);
    }

    public static double area(int n, double side) {
        if (n <= 2) {
            System.out.println("A polygon must have at least 3 sides.");
            return 0;
        }

        // Calculate the area using the provided formula
        double numerator = n * Math.pow(side, 2);
        double denominator = 4 * Math.tan(Math.PI / n);

        return numerator / denominator;
    }
}


// The area of the regular polygon is: 96.77685378312938