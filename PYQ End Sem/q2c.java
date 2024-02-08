public class q2c {
    public static void main(String[] args) {
        int x ,y ,z ;
        x = 20;
        y = 5;
        z = 10;
        // x = Integer.parseInt(args[0]);
        // y = Integer.parseInt(args[1]);
        // z = Integer.parseInt(args[2]);
        int min = Math.min(Math.min(x, y),z);
        int max = Math.max(Math.max(x,y),z);
        int temp = x+y+z;
        int middle = temp-min-max;
        System.out.println(min);
        System.out.println(middle);
        System.out.println(max);

    }
}
