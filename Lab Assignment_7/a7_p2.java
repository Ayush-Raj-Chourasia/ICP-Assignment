// Write a java program using an array that reads the integers between 1 and 100 and counts the 
// occurrences of each. Assume the input ends with 0. Here is a sample run of the program: 
//   Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0 
// 2 occurs 2 times 
// 3 occurs 1 time 
// 4 occurs 1 time 
// 5 occurs 2 times 
// 6 occurs 1 time 
// 23 occurs 1 time 
// 43 occurs 1 time 
 
// Note that if a number occurs more than one time, the plural word 
// “times” is used in the output.

import java.util.*;


public class a7_p2 {
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
        sorting(arr);
        printArray(arr);
        count(arr);
        sc.close();
    }
    
    
    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void sorting(int arr[]){
        for (int i = 0 ;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1;j++){
                if (arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
    public static void count(int arr[]){
        int max = arr[0];
        for (int i = 1; i <arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int count = 0;
        for (int i = 1 ;i<max+1;i++){
            for(int j = 0;j<arr.length;j++){
                if (arr[j]==i){
                    count++;
                    }
                }
            if (count ==1)
                System.out.println(i+" occurs "+count+" time");
            else if(count>1)
                System.out.println(i+" occurs "+count+" times");
            count = 0; 
        }  
    
        
    }
    
}
