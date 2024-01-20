import java.util.Scanner;

public class a3_hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your gender (M or F): ");
        char gender = sc.next().charAt(0);
        System.out.print("Enter your First name: ");
        String fName = sc.next();
        System.out.print("Enter your Last name: ");
        String lName = sc.next();
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        if (gender == 'F' || gender == 'f') {
            if (age >= 20) {
                System.out.print("Are you married, " + fName + " (y or n)? ");
                char married = sc.next().charAt(0);

                if (married == 'Y' || married == 'y') {
                    System.out.print("Then I shall call you Mrs. " + fName + " " + lName);
                } else {
                    System.out.print("Then I shall call you Ms. " + fName + " " + lName);
                }
            } else {
                System.out.print("Then I shall call you " + fName + " " + lName);
            }
        } else if (gender == 'M' || gender == 'm') {
            if (age >= 20) {
                System.out.println("Then I shall call you Mr. " + fName + " " + lName);
            } else {
                System.out.println("Then I shall call you " + fName + " " + lName);
            }
        } else {
            System.out.println("Invalid Gender");
        }

        sc.close();
    }
}

//What is your gender (M or F): M
//Enter your First name: Hello
//Enter your Last name: World
//Enter your Age: 20
//Then I shall call you Mr. Hello World

