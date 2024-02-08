public class q6c {
    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static int[] delete(int[] arr,int pos){
        int arr1[] = new int[arr.length-1];
        for(int i=0;i<arr1.length;i++){
            if(i>=pos)
                arr1[i] = arr[i+1];
            else if(i<pos)
                arr1[i] = arr[i];
        }
        return arr1;
    }

    public static int[] distinct(int[] arr){
        for(int i =0;i<arr.length;i++){
            for (int j =i+1;j<arr.length;j++)
              if (arr[i]==arr[j])
                arr = delete(arr,j);
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {20,30,50,40,20,30};
        arr = distinct(arr);
        System.out.println("No. of slice: "+arr.length);
        printArray(arr);
    }
    
}
