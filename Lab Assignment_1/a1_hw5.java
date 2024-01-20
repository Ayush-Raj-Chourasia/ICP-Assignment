public class a1_hw5 {
    public static void main(String[] args) {
        // Initial values
        int W = 10, G = 20, K = 30, A = 40;

        System.out.println("Before Exchange:");
        System.out.println("W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);

        // Exchange using extra variables
        int tempW = W;
        int tempG = G;

        W = A;
        A = K;
        K = tempG;
        G = tempW;

        System.out.println("\nAfter Exchange:");
        System.out.println("W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);


        System.out.println("Before Exchange:");
        System.out.println("W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);

        // Exchange without extra variables
        W = W + G;
        G = W - G;
        W = W - G;

        A = A + K;
        K = A - K;
        A = A - K;

        System.out.println("\nAfter Exchange:");
        System.out.println("W = " + W + ", G = " + G + ", K = " + K + ", A = " + A);
    
    }
}

//Before Exchange:
//W = 10, G = 20, K = 30, A = 40
//
//After Exchange:
//W = 40, G = 10, K = 20, A = 30
//Before Exchange:
//W = 40, G = 10, K = 20, A = 30
//
//After Exchange:
//W = 10, G = 40, K = 30, A = 20



