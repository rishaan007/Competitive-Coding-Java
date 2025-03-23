import java.util.*;
public class Min
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("Enter the size of the array");
        int size =sc.nextInt();
        int num[]=new int[size];
        System.out.println("Enter array elements");
        for(i=0;i<size;i++)
        {
        num[i]=sc.nextInt();
    }
    int min=num[0];
    for(j=0;j<size-1;j++)
    {
        if(min<num[j+1])
        {
        min=min;
    }
    else
    {
        min=num[j+1];
    }   
    }
    System.out.println(min);
}
}