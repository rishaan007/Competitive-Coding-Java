import java.util.*;

class ConsChange {
    String wrd;
    int len;

    // Constructor
    ConsChange() {
        wrd = "";
        len = 0;
    }

    // Read input word
    void readword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word in lowercase:");
        wrd = sc.next();  // Read a single word
        len = wrd.length();
        sc.close();  // Close scanner to prevent memory leaks
    }

    // Shift consonants to the front and vowels to the back
    void shiftcons() {
        String vow = "";  // To store vowels
        String cons = ""; // To store consonants

        for (int i = 0; i < len; i++) {
            char ch = wrd.charAt(i);
            
            // Corrected condition for vowel checking
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vow += ch;  // Store vowels
            } else {
                cons += ch; // Store consonants
            }
        }

        // Form the new word
        String wrd2 = cons + vow;
        System.out.println("Rearranged Word: " + wrd2);
    }

    // Change consonants to uppercase
    void changeword() {
        String s = "";
        for (int i = 0; i < len; i++) {
            char ch = wrd.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                s += (char) (ch - 32); // Convert to uppercase
            } else {
                s += ch; // Keep vowels as they are
            }
        }
        System.out.println("Modified Word (Consonants Uppercase): " + s);
    }

    // Display original word
    void show() {
        System.out.println("Original Word: " + wrd);
        changeword();
    }

    // Main method
    public static void main(String args[]) {
        ConsChange obj = new ConsChange();
        obj.readword();
        obj.shiftcons();
        obj.show();
    }
}
