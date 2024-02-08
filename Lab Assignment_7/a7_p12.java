// The selection-sort method repeatedly finds the smallest number in the current array and swaps it 
// with the first. Write a java program that reads in ten integer values, invoke the method, and 
// displays the sorted elements. 

import java.util.Scanner;

public class a7_p12 {
    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static int[] selectionSorting(int[] arr){

        
        for(int i =0;i<arr.length-1;i++){
            int min = i;
            for(int j =i+1;j<arr.length;j++){
             if (arr[j]<arr[min])
                min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            printArray(arr);
        
        }
        return arr;
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
        // int arr[]= {3,2,4,1,5,6,8,7,10,9};
        printArray(arr);
        selectionSorting(arr);
        printArray(arr);
        sc.close();
    }
}

// Input
// Array: 3 2 4 1 5 6 8 7 10 9 

// Array: 1 2 4 3 5 6 8 7 10 9
// Array: 1 2 4 3 5 6 8 7 10 9
// Array: 1 2 3 4 5 6 8 7 10 9
// Array: 1 2 3 4 5 6 8 7 10 9
// Array: 1 2 3 4 5 6 8 7 10 9
// Array: 1 2 3 4 5 6 8 7 10 9
// Array: 1 2 3 4 5 6 7 8 10 9
// Array: 1 2 3 4 5 6 7 8 10 9
// Array: 1 2 3 4 5 6 7 8 9 10

// Output
// Array: 1 2 3 4 5 6 7 8 9 10