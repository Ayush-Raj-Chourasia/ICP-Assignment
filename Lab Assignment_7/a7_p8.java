// Design and develop a menu driven java program for the following array operations.
// a. Create an array of N integers 
// b. Display the array elements 
// c. Insert an element at specific position 
// d. Delete an element at a given position 
// e. Exit

import java.util.Scanner;

public class a7_p8 {
    private static Scanner sc = new Scanner(System.in);
    public static int[] create(int n){
        int arr[] = new int[n];
        System.out.println("Enter elements in array");
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    
    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static int[] insert(int[] arr){
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        System.out.print("Enter element: ");
        int num = sc.nextInt();
        int arr1[] = new int[arr.length+1];
        printArray(arr);
        for(int i =0;i<arr1.length;i++){
            if (i ==pos)
                arr1[i]=num;
            else if (i<pos) {
                arr1[i]=arr[i];
            }
            else if(i>pos)
                arr1[i] =arr[i-1];
        }
        printArray(arr1);
        return arr1;

    }
    public static int[] delete(int[] arr){
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        if(pos>arr.length || pos<0){
            System.out.println("Position not found");
            return arr;
        }
        else{
            int arr1[] = new int[arr.length-1];
            printArray(arr);

            for(int i =0;i<arr1.length;i++){
                if (i >=pos)
                    arr1[i] = arr[i+1];
                else{
                    arr1[i] = arr[i];
                }
            }
            printArray(arr1);
            return arr1;
        }
    }

    public static void main(String[] args){
        int arr[] = new int[10];
        while (true){
            System.out.println("\n\t1. Create an array of N integers \n\t2. Display the array elements \n\t3. Insert an element at specific position \n\t4. Delete an element at a given position \n\t5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            switch (ch){
                case 1: System.out.print("Enter size of array: ");
                        int n = sc.nextInt();
                        arr = create(n);
                        break;
                case 2: printArray(arr);break;
                case 3: arr= insert(arr);
                        break;
                case 4: arr = delete(arr);
                        break;
                case 5: sc.close();
                        System.exit(0);
                default: System.out.println("Wrong input");
            }
        }
    }
    
}




// 1. Create an array of N integers 
// 2. Display the array elements 
// 3. Insert an element at specific position 
// 4. Delete an element at a given position 
// 5. Exit
// Enter choice: 1
// Enter size of array: 5
// Enter elements in array
// 1
// 2
// 3
// 4
// 5

// 1. Create an array of N integers 
// 2. Display the array elements
// 3. Insert an element at specific position
// 4. Delete an element at a given position
// 5. Exit
// Enter choice: 2
// Array: 1 2 3 4 5

// 1. Create an array of N integers
// 2. Display the array elements
// 3. Insert an element at specific position
// 4. Delete an element at a given position
// 5. Exit
// Enter choice: 3
// Enter position: 3
// Enter element: 6
// Array: 1 2 3 4 5
// Array: 1 2 3 6 4 5

// 1. Create an array of N integers
// 2. Display the array elements
// 3. Insert an element at specific position
// 4. Delete an element at a given position
// 5. Exit
// Enter choice: 4
// Enter position: 3
// Array: 1 2 3 6 4 5
// Array: 1 2 3 4 5

// 1. Create an array of N integers
// 2. Display the array elements
// 3. Insert an element at specific position
// 4. Delete an element at a given position
// 5. Exit
// Enter choice: 5