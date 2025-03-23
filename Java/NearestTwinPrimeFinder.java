import java.util.*;
public class NearestTwinPrimeFinder
 {
    public static void main(String[] args)
 {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        int nearestTwinPrime = findNearestTwinPrime(n);
        if (nearestTwinPrime != -1)
 {
            System.out.println("The nearest twin prime to " + n + " is " + nearestTwinPrime + "and" + (nearestTwinPrime+2)+".");
        } 
else
 {
            System.out.println("No twin prime found for " + n + ".");
        }
    }
    public static int findNearestTwinPrime(int n)
 {
        if (n < 3) {
            return -1; 
        }
        for (int i = n; ; i++) 
{
            if (isPrime(i) && isPrime(i + 2))
 {
                return i;
            }
        }
    }

    public static boolean isPrime(int num)
 {
        if (num < 2)
 {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
{
            if (num % i == 0) 
{
                return false;
            }
        }
        return true;
    }
}









