// Write a method that finds the smallest element in an array of double values using the following 
// header: 
// public static double min(double[] array) 
 
// Write a java program that prompts the user to enter ten numbers, invokes this method to return 
// the minimum value, and displays the minimum value. Here is a sample run of the program: 
 
// Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2 
// The minimum number is: 1.5

import java.util.Scanner;

public class a7_p4 {
    public static void printArray(double[] arr){
        System.out.print("Array: ");
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static double min(double[] arr){
        double min = arr[0];
        for (int i = 1;i<arr.length;i++){
            if (arr[i]<min)
                min = arr[i];
        }
        System.out.println(min);
        return min;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        double arr[]= new double[n];
        System.out.println("Enter elements in array");
        for (int i = 0 ;i<n;i++){
            arr[i] = sc.nextDouble();
        }
        printArray(arr);
        System.out.println("The minimum nunmber is :"+ min(arr));
        sc.close();
    }
}


// Enter size of array: 10
// Enter elements in array
// 1.9
// 2.5
// 3.7
// 2
// 1.5
// 6
// 3
// 4
// 5
// 2
// Array: 1.9 2.5 3.7 2.0 1.5 6.0 3.0 4.0 5.0 2.0 
// 1.5
// The minimum nunmber is :1.5