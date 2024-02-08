public class q2b {
    public static void main(String[] args){
        int x, y;
        int min =1,max=6;
            x = (int) (Math.random()*(max-min+1))+1;
            y = (int) (Math.random()*(max-min+1))+1;
            System.out.println(x);
            System.out.println(y);
            if ((x+y)>6)
                System.out.println("Good");
    }
}
