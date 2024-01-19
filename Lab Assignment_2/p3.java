package assignment2;

import java.util.Scanner;

public class p3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();

        double dearnessAllowance = 0.4 * basicSalary;
        double houseRentAllowance = 0.2 * basicSalary;
        double grossSalary = basicSalary + dearnessAllowance + houseRentAllowance;

        System.out.println("DA is " + dearnessAllowance);
        System.out.println("HRA is " + houseRentAllowance);
        System.out.println("Gross salary is " + grossSalary);
    }
}