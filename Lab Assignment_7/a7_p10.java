// Write a method that returns a new array by eliminating the duplicate values in the array using 
// the following method header: 
 
// public static int[] eliminateDuplicates(int[] list) 
 
// Write a java program that reads in ten integers, invokes the method, and displays the result. 
// Here is the sample run of the program: 
 
// Enter ten numbers: 1 2 3 2 1 6 3 4 5 2 
// The distinct numbers are: 1 2 3 6 4 5

import java.util.Scanner;

public class a7_p10 {

    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static int[] delete(int[] arr, int pos){
        if(pos>arr.length || pos<0){
            System.out.println("Position not found");
            return arr;
        }
        else{
            int arr1[] = new int[arr.length-1];

            for(int i =0;i<arr1.length;i++){
                if (i >=pos)
                    arr1[i] = arr[i+1];
                else{
                    arr1[i] = arr[i];
                }
            }
            return arr1;
        }
    }
    public static int[] eliminateDuplicates(int[] arr) {
        int max= arr[0];
        for(int i =0;i<arr.length;i++){
            if (arr[i]>max){
                max= arr[i];
            }
        }
        for(int i =0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]==arr[i]){
                    arr= delete(arr, j);
                }
            }
                
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
        printArray(arr);
        System.out.print("The Distinct ");
        printArray(eliminateDuplicates(arr));
        sc.close();

    }
}
    


// Enter size of array: 10
// Enter elements in array
// 1
// 2
// 3
// 2
// 1
// 6
// 3
// 4
// 5
// 2
// Array: 1 2 3 2 1 6 3 4 5 2 
// The Distinct Array: 1 2 3 6 4 5 
