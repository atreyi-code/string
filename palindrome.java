import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String input;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter string: ");
            input = sc.nextLine();
        }

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
