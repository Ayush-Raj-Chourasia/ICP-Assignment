public class q7c {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=0;i--){
            for(int j=0 ; j<=n-i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
