public class RamanujanTaxi {
    public static void main(String[] args) {
        // Check if a command-line argument is provided
        // if (args.length != 1) {
        //     System.out.println("Usage: java RamanujansTaxi <N>");
        //     return;
        // }

        // Parse the command-line argument as an integer
        int N = 10; //Integer.parseInt(args[0]);

        // Use four nested loops to find and print the numbers
        for (int a = 1; a <= N; a++) {
            for (int b = 1; b <= N; b++) {
                for (int c = a; c <= N; c++) {
                    for (int d = 1; d <= N; d++) {
                        if ((a * a * a + b * b * b) == (c * c * c + d * d * d) && (a != c || b != d)) {
                            System.out.println("(" + a + "^3 + " + b + "^3) = (" + c + "^3 + " + d + "^3) = " + (a * a * a + b * b * b));
                        }
                    }
                }
            }
        }
    }
}
