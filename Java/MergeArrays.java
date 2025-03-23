import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        // Two one-dimensional arrays to be merged
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6, 7};

        // Call the mergeArrays method to merge the arrays
        int[] mergedArray = mergeArrays(array1, array2);

        // Display the merged array
        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        // Calculate the length of the merged array
        int mergedLength = arr1.length + arr2.length;

        // Create a new array to store the merged elements
        int[] mergedArray = new int[mergedLength];

        // Copy elements from the first array to the merged array
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);

        // Copy elements from the second array to the merged array
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        return mergedArray;
    }
}
