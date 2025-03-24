public class TwinPrimeNumbers {
    public static void main(String[] args) {
        int start = 10; // Starting range
        int end = 100;  // Ending range

        System.out.println("Twin Prime Numbers in the range " + start + " to " + end + ":");
        findTwinPrimes(start, end);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void findTwinPrimes(int start, int end) {
        for (int i = start; i <= end - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
}
