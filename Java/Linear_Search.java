import java.util.*;
class Linear_Search
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter the size of the array");
        int s=sc.nextInt();
        int arr[]= new int[s];
        for(i=0;i<s;i++)
        { 
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter number to be searched:");
    int k=sc.nextInt();
    for(i=0;i<s;i++)
    {
        if(arr[i]==k)
        {
         System.out.println("Present at position " +i);   
        }
    }
}
}