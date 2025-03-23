import java.util.*;
class Merger
{
    long n1,n2,mergNum;
    Merger()
    {
        n1=0;
        n2=0;
        mergNum=0;
    }
    void readNum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        n1=sc.nextLong();
        System.out.print("Enter second number");
        n2=sc.nextLong();
    }
    void JoinNum()
    {
        int p=1;
        long t=n2;
        while(t>0)
        {
            p=p*10;
            t=t/10;
        }
        mergNum= n1 * p+ n2;
    }
    void show()
    {
        System.out.println("Original numbers"+ n1 +"and"+n2);
        System.out.println("After concatenation"+mergNum);
    }
    public static void main(String args[])
    {
        Merger obj=new Merger();
        obj.readNum();
        obj.JoinNum();
        obj.show();
    }
}