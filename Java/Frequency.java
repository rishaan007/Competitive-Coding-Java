import java.util.*;

public class Frequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        String st;

        System.out.println("Enter a line ending with a space and terminated with (.):");

        while (true) {
            st = sc.next();
            st = st.replaceAll("[^a-zA-Z]", ""); // Remove punctuation

            if (st.equalsIgnoreCase("the")) {
                c++;
            }

            if (st.equals(".")) {
                break;
            }
        }

        System.out.println("Frequency of the token 'The/the' = " + c);
    }
}
