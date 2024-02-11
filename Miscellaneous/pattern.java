public class pattern{
    public static void main(String[] args) {
        int n= 5;

        for(int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();

            
        }
        int f1 = 1;
        for(int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(f1+" ");
                f1++;
            }
            System.out.println();
           
        }

        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0;i<n;i++){
            for (int j = 0;j<=i;j++){
                System.out.print(str.charAt(j)+" ");
            }
            System.out.println();            
        }

        for(int i = n;i>0;i--){
            for (int j = i;j>0;j--){
                System.out.print("$ ");
            }
            System.out.println();
        }

        for(int i = 1;i<=n;i++){
            for (int j =n;j>i;j--){
                System.out.print(" ");
            }
            for (int k= 1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }


        for(int i = 1;i<=n;i++){
            for (int j =n;j>i;j--){
                System.out.print(" ");
            }
            for (int k= 1;k<=i;k++){
                System.out.print(i+"");
            }
            System.out.println();
        }


        for(int i = 1;i<=n;i++){
            for (int j =n;j>0;j--){
                if (i==j)
                    System.out.print("* ");
                else
                    System.out.print(j+" ");
            }
            System.out.println();
        }
        
        for(int i =1;i<n;i++){
            for (int j =1;j<n-i;j++){
                System.out.print(" ");
            }
            for (int k= 1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        

    }
}