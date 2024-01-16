public class DollarPattern {
    public static void main(String[] args) {
        int rows = 5; // You can adjust the number of rows as needed

        for (int i = 1; i <= rows; i++) {
            // Print spaces before the dollars
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }

            // Print dollars for the current row
            for (int k = 1; k <= i; k++) {
                System.out.print("$ ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
