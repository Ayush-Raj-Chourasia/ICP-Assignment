// import java.util.*;

// public class jadhfjgsd {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the integers between 1 and 100 (end with 0): ");

//         // Initialize an array to count occurrences of numbers from 1 to 100
//         int[] counts = new int[101]; // Index 0 is not used, 1-100 are used for counting

//         // Read integers until 0 is encountered
//         int num;
//         do {
//             num = sc.nextInt();
//             if (num >= 1 && num <= 100) {
//                 counts[num]++;
//             }
//         } while (num != 0);

//         // Display the counts
//         for (int i = 1; i <= 100; i++) {
//             if (counts[i] != 0) {
//                 System.out.printf("%d occurs %d time%s\n", i, counts[i], (counts[i] > 1) ? "s" : "");
//             }
//         }

//         sc.close();
//     }
// }

// import java.util.*;

// public class jadhfjgsd {
//     public static void display(int arr[]) {
//         System.out.println("Array elements are: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the length array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the " + n + " array elements are: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int max = arr[0];
//         for (int i = 1; i < n; i++) {
//             if (arr[i] > max)
//                 max = arr[i];
//         }

//         int count[] = new int[max + 1];
//         for (int i = 0; i < arr.length; i++) {
//             count[arr[i]]++;
//         }
//         for (int i = 0; i < count.length; i++) {
//             if (count[i] > 1)
//                 System.out.println(i + " occurs " + count[i] + " times");
//             else if (count[i] > 0)
//                 System.out.println(i + " occurs " + count[i] + " time");
//         }
//     }
// }

// import java.util.*;

// public class jadhfjgsd {
//     public static int[] create(int n) {
//         int arr[] = new int[n];
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the " + n + " array elements are: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         return arr;
//     }

//     public static void display(int arr[]) {
//         if (arr.length == 0)
//             System.out.println("Array is empty");
//         else {
//             System.out.println("Array elements are: ");
//             for (int i = 0; i < arr.length; i++) {
//                 System.out.print(arr[i] + " ");
//             }
//         }
//     }

//     public static int[] InsertAnyPos(int arr[], int pos, int item) {
//         int newArr[] = new int[arr.length + 1];
//         for (int i = 0; i < newArr.length; i++) {
//             if (i < pos - 1)
//                 newArr[i] = arr[i];
//             else if (i == pos - 1)
//                 newArr[i] = item;
//             else
//                 newArr[i] = arr[i - 1];
//         }
//         System.out.println(item + "insert at " + pos + " position");
//         return newArr;
//     }

//     public static int[] DeleteAnyPos(int arr[], int pos) {
//         int newArr[] = new int[arr.length - 1];
//         if (pos > arr.length || pos < 0)
//             System.out.println("Position not found");
//         else {
//             for (int i = 0; i < newArr.length; i++) {
//                 if (i < pos - 1)
//                     newArr[i] = arr[i];
//                 else if (i == pos - 1) {
//                     System.out.println("Deleted item is: " + arr[pos - 1]);
//                     newArr[i] = arr[i + 1];
//                 } else
//                     newArr[i] = arr[i + 1];
//             }
//         }
//         return newArr;
//     }

//     public static void main(String[] args) {
//         int arr[] = new int[10];
//         Scanner sc = new Scanner(System.in);
//         do {
//             System.out.println(
//                     "\nPress 1 for create array, 2 for display, 3 for insert element at specific position, 4 for delete a item from array, 5 for exit");
//             System.out.println("Enter your choice: ");
//             int ch = sc.nextInt();
//             switch (ch) {
//                 case 1:
//                     System.out.println("Enter the size of array: ");
//                     int n = sc.nextInt();
//                     arr = create(n);
//                     break;
//                 case 2:
//                     display(arr);
//                     break;
//                 case 3:
//                     System.out.println("Enter the position to be inserted:");
//                     int pos = sc.nextInt();
//                     System.out.println("Enter the array elements:");
//                     int item = sc.nextInt();
//                     arr = InsertAnyPos(arr, pos, item);
//                     break;
//                 case 4:
//                     System.out.println("Enter the position to be deleted:");
//                     int p = sc.nextInt();
//                     arr = DeleteAnyPos(arr, p);
//                     break;
//                 case 5:
//                     System.exit(0);
//                 default:
//                     System.out.println("Wrong input");
//             }
//         } while (true);
//     }
// }


// public static int[] bubbleSorting(int[] arr){

//     for (int i=0;i<arr.length;i++){
//         for (int j=i+1;j<arr.length;j++){
//             if (arr[j]<arr[i]){
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//     }


//     return arr;
// }