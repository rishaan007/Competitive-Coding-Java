import java.util.Scanner;

public class BubbleSort {
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

        // Choose the sorting order
        System.out.println("Choose the sorting order:");
        System.out.println("1. Ascending order");
        System.out.println("2. Descending order");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        // Call the bubbleSort method to sort the array based on the user's choice
        bubbleSort(array, choice);

        // Display the sorted array
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr, int order) {
        int n = arr.length;
        boolean swapped;

        switch (order) {
            case 1: // Ascending order
                do {
                    swapped = false;
                    for (int i = 1; i < n; i++) {
                        if (arr[i - 1] > arr[i]) {
                            // Swap elements if they are in the wrong order
                            int temp = arr[i - 1];
                            arr[i - 1] = arr[i];
                            arr[i] = temp;
                            swapped = true;
                        }
                    }
                } while (swapped);
                break;

            case 2: // Descending order
                do {
                    swapped = false;
                    for (int i = 1; i < n; i++) {
                        if (arr[i - 1] < arr[i]) {
                            // Swap elements if they are in the wrong order
                            int temp = arr[i - 1];
                            arr[i - 1] = arr[i];
                            arr[i] = temp;
                            swapped = true;
                        }
                    }
                } while (swapped);
                break;

            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
    }
}
