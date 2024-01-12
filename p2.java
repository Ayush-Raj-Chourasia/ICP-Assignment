package assignment5;

import java.util.*;
public class p2
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number: ");
int number = sc.nextInt();
int count = 0, rev_count = 0;
int rev = 0;
int no = number;
for(int i = 2;i<=no/2;i++)
{
if(no%i == 0)
{
count = 1;
break;
}
}
while(no!=0)
{
int rem = no%10;
rev = rev*10+rem;
no /= 10;
}
for(int i = 2;i<=rev/2;i++)
{
if(rev%i == 0)
{
rev_count = 1;
break;
}
}
if(count==0 && rev_count==0)
{
System.out.println(number+" is twisted prime");
}
else
{
System.out.println(number+" is not twisted prime");
}
}
}


//Enter a number: 
//97
//97 is twisted prime