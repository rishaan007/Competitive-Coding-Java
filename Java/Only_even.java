import java.util.*;
public class Only_even
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n;
        System.out.println("Enter some digits:");
        n=sc.nextLine();
        for(int i=0;i< n.length();i++)
        {
         char digit= n.charAt(i);
         int num= Character.getNumericValue (digit);
        if(num%2==0)
        {
            System.out.print(num);
        }
    }
    System.out.println();
}
}
