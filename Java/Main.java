import java.util.*;

public class Main {
    
    // Function to check if a number is a Kaprekar number
    static boolean kaprekar(int n) {   
        if (n == 1) // 1 is a Kaprekar number by definition
            return true;   
        
        int sq_n = n * n; // Calculate square of the number
        int count_digits = 0;
        
        // Count the number of digits in the square of the number
        int temp = sq_n;
        while (temp != 0) {   
            count_digits++;   
            temp /= 10;   
        }   
        
        // Try different ways of splitting the number
        for (int r_digits = 1; r_digits < count_digits; r_digits++) {   
            int eq_parts = (int) Math.pow(10, r_digits); // Divide the number based on the position of digits
            
            if (eq_parts == n) // Avoid division if it's equal to the original number
                continue;   
            
            // Get the parts of the square by dividing and taking the remainder
            int sum = sq_n / eq_parts + sq_n % eq_parts;   
            
            // Check if the sum of parts is equal to the original number
            if (sum == n)   
                return true;   
        }   
        return false;   
    }       

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        
        // Taking input range from the user
        int p, q;
        System.out.println("Enter the range (two numbers): ");
        p = sc.nextInt();
        q = sc.nextInt();
        
        // Looping through all numbers between p and q (inclusive)
        System.out.println("Kaprekar numbers in the given range are: ");
        for (int i = p; i <= q; i++) // Changed 'i < q' to 'i <= q'
            if (kaprekar(i))   
                System.out.print(i + " ");   
        
        sc.close(); // Closing the scanner to prevent memory leaks
    }   
}
