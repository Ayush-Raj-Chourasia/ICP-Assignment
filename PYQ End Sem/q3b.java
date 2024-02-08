import java.util.Scanner;

public class q3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Jerry's speed: ");
        double x = sc.nextInt();
        System.out.println("Enter Tom's speed: ");
        double y = sc.nextInt();
        if (y>x)
            System.out.println("Tom would catch Jerry");
        else    System.out.println("Tom wouldn't catch Jerry");
        sc.close();
        }
}
