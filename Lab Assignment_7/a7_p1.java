// Write a java program to create an array of size N and store the random values in it and find the 
// sum and average.

import java.util.Scanner;
public class a7_p1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int min = 1; int max = n;
        System.out.print("Array: ");
        for (int i = 0;i<n;i++){
            int a = (int) (Math.random()*(max-min +1))+1;
            arr[i] = a;
            System.out.print(a+" ");
        }
        System.out.println();
        sc.close();
        int sum = sum(arr);
        System.out.println("Sum: "+ sum);
        System.out.println("Average: "+(double)(sum/n));
    }
    public static int sum(int[] arr){
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        return sum;
    }

    
}


// Enter size of array: 5
// Enter values in the array
// 1
// 2
// 3
// 4
// 5
// Average: 3.0
// Sum: 15


