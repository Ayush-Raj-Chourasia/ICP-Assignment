import java.util.Scanner;

public class q10b {

    public static double area(double r){
        return Math.PI*r*r;
    }

    public static double area(double x, double y){
        return x*y;
    }

    public static int area(int x){
        return x*x;    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Area of 1. Circle 2. Rectangle 3. Square: ");
        int ch = sc.nextInt();
        if (ch==1){
            System.out.print("Enter Radius: ");
            double r = sc.nextDouble();
            System.out.println("Area: "+area(r));
        }
        else if (ch ==2){
            System.out.print("Enter Length: ");
            double x = sc.nextDouble();
            System.out.print("Enter Breadth: ");
            double y = sc.nextDouble();
            System.out.println("Area: "+ area(x, y));
        }
        else if (ch ==3){
            System.out.print("Enter side: ");
            int x = sc.nextInt();
            System.out.println("Area: "+ area(x));
        }
        sc.close();
    }
    
}
