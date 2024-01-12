package assignment5;


import java.util.*;
public class p1
{
public static void main(String[] args)
{
	
	
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter first number: ");
int no1 = sc.nextInt();
System.out.println("Enter second number: ");
int no2 = sc.nextInt();
int no1_sum = 0, no2_sum = 0;
for(int i = 1;i<=no1/2;i++)
{
if(no1%i == 0)
{
no1_sum += i;
}
}
for(int i = 1;i<=no2/2;i++)
{
if(no2%i == 0)
{
no2_sum += i;
}
}
if(no1_sum==no2 && no2_sum==no1)
{
System.out.println(no1+" and "+no2+" are amicable numbers");
}
else
{
System.out.println(no1+" and "+no2+" are not amicable numbers");
}
}
}

//Enter first number: 
//220
//Enter second number: 
//284
//220 and 284 are amicable numbers
