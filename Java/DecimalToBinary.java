import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a decimal number from the user
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert the decimal number to binary
        String binaryEquivalent = convertToBinary(decimalNumber);

        // Display the binary equivalent
        System.out.println("Binary equivalent: " + binaryEquivalent);
    }

    public static String convertToBinary(int decimalNumber) {
        // Use Integer.toBinaryString to convert decimal to binary
        return Integer.toBinaryString(decimalNumber);
    }
}
