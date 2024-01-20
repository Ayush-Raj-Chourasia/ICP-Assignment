public class a2_cmd1 {
        public static void main(String[] args) {
            if (args.length != 3) {
                System.out.println("Simple Interest Calculator");
                return;
            }
            double principle = Double.parseDouble(args[0]);
            double rate = Double.parseDouble(args[1]);
            double time = Double.parseDouble(args[2]);

            double simpleInterest = (principle * rate * time) / 100;
    
            System.out.println("Principle: " + principle);
            System.out.println("Rate: " + rate);
            System.out.println("Time: " + time);
            System.out.println("Simple Interest: " + simpleInterest);
        }
    }
    