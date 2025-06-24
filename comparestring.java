public class comparestring {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";

        if (areStringsEqual(str1, str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }
public static boolean areStringsEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}

    

