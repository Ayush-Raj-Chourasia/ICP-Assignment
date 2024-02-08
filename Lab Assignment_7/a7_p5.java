// Write a java program to find the second largest value in an array of n elements.

import java.util.Scanner;

public class a7_p5 {
    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static int secondMax(int[] arr){
        int max = 0;
        int secondmax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            }
            else if (arr[i] > secondmax && arr[i] != max) {
                secondmax = arr[i];
            }
        }
        return secondmax;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements in array");
        for (int i = 0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.println("The second maximum nunmber is :"+ secondMax(arr));
        sc.close();
    }
}


// Enter size of array: 5  
// Enter elements in array
// 30
// 29
// 58
// 70
// 47
// Array: 30 29 58 70 47
// The second maximum nunmber is :58
