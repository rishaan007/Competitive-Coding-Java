import java.util.*;

class Admission {
    int Adno[];

    // Constructor to initialize array of size 10
    public Admission() {
        Adno = new int[10];
    }

    // Method to fill the array with user input
    void fillArray() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            Adno[i] = sc.nextInt();
        }
        Arrays.sort(Adno); // Sort the array for binary search
        System.out.println("Array has been sorted for binary search.");
    }

    // Recursive Binary Search Function
    int binSearch(int l, int u, int v) {
        if (l > u) {
            return -1; // Value not found
        } else {
            int mid = (l + u) / 2; // Calculate middle index
            
            if (v > Adno[mid]) {
                return binSearch(mid + 1, u, v); // Search in the right half
            } else if (v < Adno[mid]) {
                return binSearch(l, mid - 1, v); // Search in the left half
            } else {
                return mid; // Return index where value is found
            }
        }
    }

    // Main method
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Admission ob = new Admission();
        
        ob.fillArray(); // Fill and sort the array
        
        System.out.print("Enter a number to search: ");
        int v = sc.nextInt();
        
        int x = ob.binSearch(0, ob.Adno.length - 1, v);
        
        if (x != -1) {
            System.out.println("Found at index: " + x);
        } else {
            System.out.println("Not Found");
        }
        
        sc.close(); // Close the scanner
    }
}
