import java.util.*;
public class GoldbachNumber
{
    public static boolean isPrime(int num)
    {
        int c=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                c++;
            }
        }
        return c==2;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF N:");
        int n=sc.nextInt();
        if(n<=9 || n>=50)
        {
            System.out.println("INVALID INPUT");
            return;
        }
        if(n%2!=0)
        {
            System.out.println("INVALID INPUT");
            return;
        }
        System.out.println("PRIME PAIRS ARE:");
        int a=3;
        int b=0;
        while (a<=n/2)
        {
            b=n-a;
            if(isPrime(a) && isPrime(b))
            {
                System.out.println(a+","+b);
            }
            a+=2;
        }
    }
}
