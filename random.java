public class random{
    public static void main(String[] args) {
        // Generating a random double value between 0.0 (inclusive) and 1.0 (exclusive)
        double randomValue = Math.random();

        System.out.println("Random Value: " + randomValue);

        // If you want to generate a random value within a specific range, you can use
        // the formula: min + (Math.random() * (max - min))
        int min = 5;
        int max = 10;
        int randomIntInRange = min + (int) (Math.random() * (max - min + 1));

        System.out.println("Random Integer in Range [" + min + ", " + max + "]: " + randomIntInRange);
    }
}
