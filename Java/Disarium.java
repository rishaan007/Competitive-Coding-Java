import java.util.*;
class Disarium
{
    int num,size;
    Disarium(int nn)
    {
      num=nn;
      size=0;
    }
    void countDigit()
    {
        int t=num;
        while(t>0)
        {
            size++;
            t=t/10;
        }
    }
    int sumOfDigits(int n,int p)
    {
      if(n==0)
      return 0;
      else
      return (int)Math.pow((n%10),p)+sumOfDigits((n/10),p-1);
    }
    void check()
    {
        if(num==sumOfDigits(num,size))
        {
            System.out.println("DISARIUM NUMBER");
        }
        else
        {
            System.out.println("NOT A DISARIUM NUMBER");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        Disarium obj=new Disarium(n);
        obj.countDigit();
        obj.check();    
    }
}