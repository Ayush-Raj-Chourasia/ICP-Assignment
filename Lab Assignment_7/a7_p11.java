// Write a sort method that uses the bubble-sort algorithm. The bubble sort algorithm makes 
// several passes through the array. On each pass, successive neighbouring pairs are compared. If a 
// pair  is  not  in  order,  its  values  are  swapped;  otherwise, the  values  remain  unchanged.  The 
// technique is called a bubble sort or sinking sort because the smaller values gradually “bubble” 
// their way to the top and the larger values “sink” to the bottom. Write a java program that reads 
// in ten double numbers, invokes the method, and displays the sorted numbers.

import java.util.Scanner;

public class a7_p11 {

    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static int[] bubbleSorting(int[] arr){
        // Time complexity = O(n^2)
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                printArray(arr);
            }
            System.out.println();
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

        printArray(arr);
        bubbleSorting(arr);
        printArray(arr);
        sc.close();
    }
}


// Input
// Array: 3 2 4 1 5 6 8 7 10 9

// Array: 2 3 4 1 5 6 8 7 10 9
// Array: 2 3 4 1 5 6 8 7 10 9
// Array: 2 3 1 4 5 6 8 7 10 9
// Array: 2 3 1 4 5 6 8 7 10 9
// Array: 2 3 1 4 5 6 8 7 10 9
// Array: 2 3 1 4 5 6 8 7 10 9
// Array: 2 3 1 4 5 6 7 8 10 9
// Array: 2 3 1 4 5 6 7 8 10 9
// Array: 2 3 1 4 5 6 7 8 9 10

// Array: 2 3 1 4 5 6 7 8 9 10
// Array: 2 3 1 4 5 6 7 8 9 10
// Array: 2 1 3 4 5 6 7 8 9 10 
// Array: 2 1 3 4 5 6 7 8 9 10
// Array: 2 1 3 4 5 6 7 8 9 10
// Array: 2 1 3 4 5 6 7 8 9 10
// Array: 2 1 3 4 5 6 7 8 9 10
// Array: 2 1 3 4 5 6 7 8 9 10
// Array: 2 1 3 4 5 6 7 8 9 10

// Array: 2 1 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10

// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10

// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10 
// Array: 1 2 3 4 5 6 7 8 9 10

// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10

// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10

// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10

// Array: 1 2 3 4 5 6 7 8 9 10
// Array: 1 2 3 4 5 6 7 8 9 10

// Array: 1 2 3 4 5 6 7 8 9 10

// Output
// Array: 1 2 3 4 5 6 7 8 9 10



