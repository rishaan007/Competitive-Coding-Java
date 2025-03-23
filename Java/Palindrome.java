import java.util.*;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int x,sum=0,k;
        k=n;
        while(n>0)
        {
            x=n%10;
            sum=sum+x*x*x;
            n=n/10;
        }
        if(sum==k)
        {
            System.out.println("Palindrome");
        }
       else
       {
           System.out.println("Not");
       }
    }
}