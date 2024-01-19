import java.util.Scanner;

public class p1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a degree in Fahrenheit: ");
    double fahrenheit = sc.nextDouble();
    double celsius = (fahrenheit - 32) * (5.0 / 9);
    System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius");
    sc.close();
  }

}


