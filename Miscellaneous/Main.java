import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
       Scanner in=new Scanner(System.in);
       int i=0,c=0;
       int a[]=new int[100];
       System.out.println("ENTER THE NUMBERS IN THE ARRAY");
       while(true)
       {
    	   a[i]=in.nextInt();
    	   if(a[i]==0)
    		   break;
    	   i++;
       }
       for(int j=1;j<100;j++)
       {
    	   for(int k=0;k<i;k++)
    	   { if(a[k]==j)
    		   c++;
    	   }
    	   if(c>1)
           System.out.println(j+" occurs "+c+" times ");
    	   else if(c==1)
            System.out.println(j+" occurs "+c+" time ");
    	   c=0;

       }
       
       in.close();
    }
}