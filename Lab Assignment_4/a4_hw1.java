
public class a4_hw1 {
    public static void main(String[] args) {
        int n = 10; 
        int sumOfSquares = 0;
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
        }

       
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        int squareOfSum = sum * sum;

        int difference = squareOfSum - sumOfSquares;

        System.out.println("The sum of the squares is: " + sumOfSquares);
        System.out.println("The square of the sum is: " + squareOfSum);
        System.out.println("The difference is: " + difference);
    }
}


//The sum of the squares is: 385
//The square of the sum is: 3025
//The difference is: 2640
