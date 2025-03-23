import java.util.*;
public class even
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter a number");
    n=sc.nextInt();
    while(n>0)
    {
    int a=n%10;
    if(a%2==0)
    {
        System.out.print(a+" ");
    }
    n=n/10;
}
    
}
}