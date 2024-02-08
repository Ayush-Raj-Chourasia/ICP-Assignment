// Write a java program that implements the array reversal algorithm suggested in Note 1.   
// Note 1: There  is a  simpler  algorithm  for  array  reversal  that  starts 
// out  with  two  indices,  i=0  and  j=n-1.  With  each  iteration  i  is 
// increased and j is decreased for i<j.


import java.util.Scanner;

public class a7_p6 {
    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void reverse(int[] arr){
        for (int i = 0 ;i<arr.length;i++){
            for(int j = arr.length-i-1;j>0;j--){
                if (i<j){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                    break;
            }
        }
     }
        
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
        System.out.println("Reversed array: ");
        reverse(arr);
        printArray(arr);
        sc.close();
    }
}


// Enter size of array: 6
// Enter elements in array
// 1
// 2
// 3
// 4
// 5
// 6
// Array: 1 2 3 4 5 6
// Reversed array:
// Array: 6 5 4 3 2 1