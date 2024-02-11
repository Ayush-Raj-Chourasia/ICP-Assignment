import java.util.Scanner;

public class panlidrome {

    public static int integerPanlindrome(int n){
        int num = 0;
        while(n>0){
            int rem = n%10;
            num = 10*num+rem;
            
            n = n/10;
        }
        return num;
    }
    public static String stringPanlindrome(String str){
        String str1 = "";
        for(int i =str.length()-1;i>=0;i--){
            str1 += str.charAt(i);
            
        }
        return str1;
    }

    public static int[] arrayPanlindrome1(int[] arr){
        for (int i = 0;i<arr.length;i++){
            for(int j =arr.length-1-i;j>=0;j--){
                if (i<j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
        }
        return arr; 
    }

    public static int[] arrayPanlindrome(int[] arr){
        int arr1[] = new int[arr.length];
        for (int i = arr.length-1;i>=0;i--){
            arr1[arr.length-1-i] = arr[i];
    }
        return arr1; 
    }
    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  123;
        String str = "Hello";
        int arr[] = {1,2,3,4,5};
        System.out.println(integerPanlindrome(n));
        System.out.println(stringPanlindrome(str));
        printArray(arrayPanlindrome1(arr));
        printArray(arrayPanlindrome(arr));
        sc.close();
    }
}
