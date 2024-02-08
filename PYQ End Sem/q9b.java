import java.util.Scanner;

public class q9b {

    public static boolean linearSearch(int[] arr, int n){
        for (int i =0;i<arr.length;i++){
            if(arr[i] == n)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter element to be searched: ");
        int n = sc.nextInt();
        boolean ch = linearSearch(arr, n);
        if (ch)
            System.out.println("Number Present");
        else
            System.out.println("Number Not Present");
        sc.close();

    }
}
