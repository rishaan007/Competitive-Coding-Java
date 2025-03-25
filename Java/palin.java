import java.util.*;
public class palin {
    int num;
    palin() {
        num = 0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();
        sc.close();  // Closing the scanner to avoid resource leak
    }

    int reverse(int y, int revnum) {
        if (y > 0) {
            revnum = revnum * 10 + y % 10;
            return reverse(y / 10, revnum);
        } else {
            return revnum;
        }
    }

    void check() {
        int reversedNum = reverse(num, 0); // Pass 0 as initial reversed number
        if (reversedNum == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    public static void main(String args[]) {
        palin obj = new palin();
        obj.accept();
        obj.check();
    }
}
