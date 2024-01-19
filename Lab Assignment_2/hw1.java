package assignment2;

import java.util.Scanner;

public class hw1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        long minutes = sc.nextLong();

        long years = minutes / (60 * 24 * 365);
        int days = (int) (minutes / (60 * 24) % 365);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
    }
}