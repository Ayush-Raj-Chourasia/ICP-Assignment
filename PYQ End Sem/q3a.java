import java.util.Scanner;

public class q3a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        if (x==0&&y==0)
            System.out.println("origin");
        else if(x==0||y==0)
            System.out.println("on axis");
        else if(x>0&&y>0)
            System.out.println("1st Quadrant");
        else if(x>0&&y<0)
            System.out.println("4th Quadrant");
        else if(x<0&&y>0)
            System.out.println("2nd Quadrant");
        else if(x<0 &&y<0)
            System.out.println("3rd Quadrant");
        sc.close();
        
    }
}
