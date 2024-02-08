import java.util.Scanner;

public class q10a{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str1 = "";
        
        for (int i = str.length()-1;i>=0;i--){
            str1 += str.charAt(i);
        }
        System.out.println(str1);
        if (str.equalsIgnoreCase(str1))
            System.out.println("Palindrome");
        else
             System.out.println("Not a Palindrome");
        sc.close();
    }
}