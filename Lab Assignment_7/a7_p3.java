// Input 10 integers from the keyboard into an array. The number to be searched is entered through 
// the keyboard by the user. Write a java program to find if the number to be searched is present in 
// the array and if it is present, display the number of times it appears in the array. 

import java.util.*;
public class a7_p3 {

    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
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
        System.out.print("Enter number to be searched: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]==num)
                count++;
        }
        if (count==0)
            System.out.println("Number not found");
        else
            System.out.println("Number appears "+count+" times");
        sc.close();
    }
}


// Enter size of array: 10
// Enter elements in array
// 1
// 2
// 3
// 2
// 3
// 4
// 5
// 4
// 6
// 4
// Array: 1 2 3 2 3 4 5 4 6 4 
// Enter number to be searched: 2
// Number appears 2 times