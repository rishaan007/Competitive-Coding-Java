import java.util.*;

class Rearrange {
    static void sortVowels(String S) {
        int n = S.length();
        List<Character> vowels = new ArrayList<>();
        
        // Extract vowels
        for (int i = 0; i < n; i++) {
            char ch = Character.toLowerCase(S.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels.add(S.charAt(i));
            }
        }
        
        if (vowels.isEmpty()) {
            System.out.print(S);
            return;
        }
        
        // Sort vowels
        Collections.sort(vowels);
        
        StringBuilder result = new StringBuilder();
        int vowelIndex = 0;

        // Reconstruct the string
        for (int i = 0; i < n; i++) {
            char ch = S.charAt(i);
            if (Character.toLowerCase(ch) == 'a' || Character.toLowerCase(ch) == 'e' ||
                Character.toLowerCase(ch) == 'i' || Character.toLowerCase(ch) == 'o' || Character.toLowerCase(ch) == 'u') {
                result.append(vowels.get(vowelIndex++));
            } else {
                result.append(ch);
            }
        }
        
        // Print the result
        System.out.println("Rearranged String: " + result.toString());
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String S = sc.nextLine();
        sortVowels(S);
        sc.close();
    }
}
