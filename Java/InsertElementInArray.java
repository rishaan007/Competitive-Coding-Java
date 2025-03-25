import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the given size
        int[] array = new int[size];

        // Input elements for the array
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Input the element to be inserted
        System.out.print("Enter the element to be inserted: ");
        int elementToInsert = scanner.nextInt();

        // Input the position where the element should be inserted
        System.out.print("Enter the position to insert the element: ");
        int position = scanner.nextInt();

        // Call the insertElement method to insert the element at the specified position
        array = insertElement(array, elementToInsert, position);

        // Display the updated array
        System.out.println("Updated array after insertion:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int[] insertElement(int[] arr, int element, int position) {
        int newSize = arr.length + 1;
        int[] newArray = new int[newSize];

        // Copy elements from the original array to the new array up to the specified position
        for (int i = 0; i < position - 1; i++) {
            newArray[i] = arr[i];
        }

        // Insert the new element at the specified position
        newArray[position - 1] = element;

        // Copy the remaining elements from the original array to the new array
        for (int i = position; i < newSize; i++) {
            newArray[i] = arr[i - 1];
        }

        return newArray;
    }
}
