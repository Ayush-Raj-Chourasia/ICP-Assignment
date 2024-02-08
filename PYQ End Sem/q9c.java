
public class q9c {
    public static double min(double [] arr){
        double min = arr[0];
        for(int i= 0;i<arr.length;i++){
            if (arr[i]<min)
                min = arr[i];
        }
        return min;

    }
    public static void main(String[] args) {
        double arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Smallest element: "+min(arr));
    }

}
