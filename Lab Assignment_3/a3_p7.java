import java.util.Scanner;

public class a3_p7 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of units consumed: ");
        double unit = sc.nextDouble();
        double bill = 0;
        if (unit<=50)
        	bill =- unit*3;
        else if (unit>50 && unit <= 200)
        	bill = 50 *3 + (unit-50)*4.80;
        else if (unit>200 && unit <= 400)
        	bill = (50 *3) + (150*4.80)  + (unit-200)*5.80;
        else 
        	bill = 50 *3 + (150*4.80)+ 200*5.80 +(unit-400)*6.80;
        
        
        System.out.println("No. of units consumed: "+  unit);
        System.out.print("Do you want to pay online(y/n): ");
        char a = sc.next().charAt(0);
        System.out.println("Total Amount: "+  bill );
        if (a == 'y' || a =='Y') {
        	double discount  = bill *0.03;
        	System.out.println("Discount: "+ discount);
        	bill = bill - discount;
        	System.out.println("Total Amount: "+  bill );
        	}
        else 
        	System.out.println("Total Amount: "+  bill );
        sc.close();
        }
        	
	}

//Enter the number of units consumed: 100
//No. of units consumed: 100.0
//Do you want to pay online(y/n): y
//Total Amount: 390.0
//Discount: 11.7
//Total Amount: 378.3


