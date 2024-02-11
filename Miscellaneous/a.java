
public class a {

    public static void main(String[] args){
        // byte y = 15, z = (byte) -y;
        // System.out.println(~y);
        // System.out.println(~z);
        // y&= ~y;
        // System.out.println(y);
        // System.out.println(y>>2);
        // byte x = -11;
        // byte f = 50;
        // short e = 50;
        // System.out.println(x>>>28);
        // System.out.println(f==e);
        // // System.out.println((int)(-11/Math.pow(2,28)));


        int i = 140;
        short s = 23;
        byte b = (byte) i;
        System.out.println(b);
        int h = b+s;
        System.out.println(h);
        h = h%2-20;
        System.out.println(h);

        
        int x = 4 , y = - 8;
        // y = x++;
        // System.out.println(y);
        if (++ x <(y=y-=7)||(x=x+=14)>y){
        System.out.println ( x +","+y) ;

        }else{
        System.out.println((x - y) +","+(y-x)) ;
    }

    System.out.println(5>>120);


    // int arr[] = new int[5];
    // int sum =0;
    // for(int i = 0;i<arr.length;i++){
    //     arr[i] = arr[i]+ i*2;
    //     sum+=arr[i];
    //     System.out.println(arr[i]);
    // }
    // System.out.println(sum);

    // System.out.println(6/10);
    }
    
}
