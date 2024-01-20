import java.util.Scanner;

public class a3_p10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student's marks: ");
        int marks = sc.nextInt();

        switch (marks / 10) {
            case 10:
                
            case 9:
                System.out.println("Letter Grade: O");
                break;
            case 8:
                System.out.println("Letter Grade: A");
                break;
            case 7:
                System.out.println("Letter Grade: B");
                break;
            case 6:
                System.out.println("Letter Grade: C");
                break;
            case 5:
                System.out.println("Letter Grade: D");
                break;
            case 4:
                System.out.println("Letter Grade: E");
                break;
            default:
            	System.out.println("Letter Grade: F");
                break;
        }
        sc.close();
    }
}

//Enter the student's marks: 95
//Letter Grade: O

