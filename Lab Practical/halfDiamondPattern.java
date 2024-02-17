

public class halfDiamondPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i =1;i<=n;i++){
            for (int j = 1;j<=n-i;j++ ){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print(i+" ");
            }
        System.out.println();
        }


        for (int i =1;i<=n;i++){
            for (int j = 1;j<=n-i;j++ ){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print(((char)(i+64))+" ");
            }
        System.out.println();
        }

        for (int i =1;i<=n;i++){
            for (int j = 1;j<=n-i;j++ ){
                System.out.print(" ");
            }
            for(int k = 1;k<=2*i-1;k++){
                System.out.print(((char)(k+64)));
            }
        System.out.println();
        }

        for (int i =1;i<=n;i++){
            for (int j = 1;j<=n-i;j++ ){
                System.out.print(" ");
            }
            for(int k = 1;k<=2*i-1;k++){
                System.out.print(k);
            }
        System.out.println();
        }


    }
}


//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 


//     A
//    B B
//   C C C
//  D D D D
// E E E E E


//     A
//    ABC
//   ABCDE
//  ABCDEFG
// ABCDEFGHI

//     1
//    123
//   12345
//  1234567
// 123456789