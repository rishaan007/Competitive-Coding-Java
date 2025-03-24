import java.util.*;
public class Max_sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        
        int num[] = new int[size];
        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++)
        {
            num[i] = sc.nextInt();
        }
        
        // Initializing max with the first element of the array
        int max = num[0];  
        
        // Finding the maximum element
        for(int j = 1; j < size; j++) // Starting from index 1
        {
            if(num[j] > max)
            {
                max = num[j];
            }
        }
        
        // Displaying the maximum value
        System.out.println("Maximum element in the array: " + max);
        
        sc.close(); // Closing the scanner
    }
}
