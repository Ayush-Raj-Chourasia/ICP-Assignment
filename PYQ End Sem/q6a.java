import java.util.Scanner;

public class q6a {
    public static int count(String str , char c){
        int count =0;
        for(int i=0;i<str.length();i++){
            if (str.charAt(i)==c)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.next();
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);
        System.out.println("No. of occurrence: "+count(str, ch));
        sc.close();
    }
}
