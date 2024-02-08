// Write a java program that prompts the user to enter ten numbers and displays the mean and 
// standard deviation, as shown in the following sample run: 
 
// Enter ten numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2 
// The mean is 3.11 
// The standard deviation is 1.55738

import java.util.Scanner;

public class a7_p9 {
        public static void printArray(double[] arr) {
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static double mean(double[] arr){
        double sum = 0;
        for (double i : arr){
            sum += i;
        }
        double mean = sum/arr.length;
        System.out.println("The mean is: "+ mean);
        return mean;
    }

    public static double deviation(double[] arr){
        double mean = mean(arr);
        double sum = 0;
        for (int i =0;i<arr.length;i++){
            sum+= Math.pow((arr[i]-mean), 2);
        }
        return Math.sqrt(sum/(arr.length-1));
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
        double devation = deviation(arr);
        System.out.println("The standard devation is: "+devation);
        sc.close();
    }
    
}

// Enter size of array: 10
// Enter elements in array
// 1.9
// 2.5
// 3.7
// 2
// 1
// 6
// 3
// 4
// 5
// 2
// Array: 1.9 2.5 3.7 2.0 1.0 6.0 3.0 4.0 5.0 2.0
// The mean is: 3.1100000000000003
// The standard devation is: 1.5573838462127583
