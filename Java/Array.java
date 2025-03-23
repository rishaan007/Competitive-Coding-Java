import java.util.*;

class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, j, t, min;

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int num[] = new int[size + 1];  // Increased size to accommodate insertion

        System.out.println("Enter array elements");
        for (i = 0; i < size; i++) {  // Changed to i < size
            num[i] = sc.nextInt();
        }

        // Selection Sort
        for (i = 0; i < size; i++) {
            min = i;
            for (j = i + 1; j < size; j++) {  // Changed i++ to j++
                if (num[j] < num[min])
                    min = j;
            }
            // Swap elements
            t = num[i];
            num[i] = num[min];
            num[min] = t;
        }

        System.out.println("Numbers arranged in ascending order:");
        for (i = 0; i < size; i++)
            System.out.print(num[i] + " ");
        System.out.println();

        System.out.println("Enter the number to be inserted");
        int num_ins = sc.nextInt();

        System.out.println("Enter the position of the array");
        int pos = sc.nextInt();

        if (pos < 0 || pos > size) {
            System.out.println("Invalid position! Enter a position between 0 and " + size);
        } else {
            // Shifting elements to the right to make space for new element
            for (j = size; j > pos; j--) {
                num[j] = num[j - 1];
            }
            num[pos] = num_ins;  // Insert the new element

            System.out.println("Array elements after insertion:");
            for (i = 0; i <= size; i++) {  // Loop runs till size inclusive
                System.out.print(num[i] + " ");
            }
        }
        
        sc.close();
    }
}
