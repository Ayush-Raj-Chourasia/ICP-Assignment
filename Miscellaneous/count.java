public class count {
    // public static void main(String[] args){
    //     int arr[] = {1,2,3,10,8,4,6,6,6,7};
    //     int count = 0;
    //     for (int i = 1 ;i<arr.length;i++){
    //         for(int j = 0;j<arr.length;j++){
    //             if (arr[j]==i){
    //                 count++;
    //                 }
    //             }
    //         if (count ==1)
    //             System.out.println(i+" occurs "+count+" time");
    //         else if(count>1)
    //             System.out.println(i+" occurs "+count+" times");
    //         count = 0; 
    //     }
    // }
    public static void printArray(int[] arr){
        System.out.print("Array: ");
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static int[] delete(int[] arr, int pos){
        if(pos>arr.length || pos<0){
            System.out.println("Position not found");
            return arr;
        }
        else{
            int arr1[] = new int[arr.length-1];

            for(int i =0;i<arr1.length;i++){
                if (i >=pos)
                    arr1[i] = arr[i+1];
                else{
                    arr1[i] = arr[i];
                }
            }
            return arr1;
        }
    }
    public static void main(String[]args){
        int arr[]= {1,1,2,2,3,4,5,5};
        int max= arr[0];
        for(int i =0;i<arr.length;i++){
            if (arr[i]>max){
                max= arr[i];
            }
        }
        for(int i =0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]==arr[i]){
                    arr= delete(arr, j);
                }
            }
                
        }
        printArray(arr);
    }
}