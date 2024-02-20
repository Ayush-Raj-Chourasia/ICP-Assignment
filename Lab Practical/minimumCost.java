import java.util.Scanner;

public class minimumCost {
    private static Scanner sc = new Scanner(System.in);
    public static void input(int arr[]){
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        
        int rowcost[] = new int[4];
        System.out.println("Enter row cost: ");
        input(rowcost);
        int columncost[] = new int[4];
        System.out.println("Enter column cost: ");
        input(columncost);
        System.out.print("Enter current King's Row Position: ");
        int sourcerow = sc.nextInt();
        System.out.print("Enter current King's Column Position: ");
        int sourcecolumn = sc.nextInt();
        System.out.print("Enter King's destination Row Position: ");
        int destrow = sc.nextInt();
        System.out.print("Enter King's destination Column Position: ");
        int destcolumn = sc.nextInt();
        int sum = 0;
        for(int i = 0;i<=Math.abs((destrow-sourcerow));i++){
            if (i >= sourcerow && i< destrow)
                sum+= rowcost[i+1];
        }
        for(int i = 0;i<=Math.abs((destcolumn-sourcecolumn));i++){
            if (i >= sourcecolumn && i <destcolumn)
                sum+= columncost[i+1];
        }
        System.out.println("Total cost: "+ sum);
    }
    
}
