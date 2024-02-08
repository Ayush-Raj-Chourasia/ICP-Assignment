import java.util.Scanner;

public class q6b {

    public static String validatePassword(String str){
        int count =0;
        if (str.length()>=8){
            for (int i =0;i<str.length();i++){
                if (Character.isLetterOrDigit(str.charAt(i))){
                    if (Character.isDigit(str.charAt(i))){
                        count++;
                    }
                }
            }
        }
        if(count>=2)
            return "Valid Password";
        else
            return "Invalid Password";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String str = sc.next();
        System.out.println(validatePassword(str));
        sc.close();

    }
}

