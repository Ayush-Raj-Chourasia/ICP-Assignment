import java.util.Scanner;

public class a2_hw2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of eggs: ");
        int eggs = sc.nextInt();

        int gross = eggs / 144;
        int aboveGross = eggs % 144;
        int dozens = aboveGross / 12;
        int extras = aboveGross % 12;

        System.out.println("Your number of eggs is " + gross + " gross, " + dozens + " dozen, and " + extras + " eggs left over.");
        sc.close();
  
    }
}
//Enter the number of eggs: 300
//Your number of eggs is 2 gross, 1 dozen, and 0