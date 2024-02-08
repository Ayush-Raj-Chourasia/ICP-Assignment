import java.util.Scanner;

public class q9a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,5,6};
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        System.out.print("Enter element: ");
        int n = sc.nextInt();
        int arr1[] = new int[arr.length+1];
        for(int i = 0;i<arr1.length;i++){
            if (pos ==i)
                arr1[i] = n;
            else if(i>pos)
                arr1[i]= arr[i-1];
            else if(i<pos)
                arr1[i] = arr[i];
        }
        for (int i :arr1){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
