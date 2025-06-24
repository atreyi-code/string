public class Vowelconstant {

    public static void countVowelsAndConsonants(String s) {
        int v = 0, c = 0;
        String lower = s.toLowerCase();
        for (char ch : lower.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) >= 0) v++;
                else c++;
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        countVowelsAndConsonants(input);
        // Alternatively:
        countWithStreams(input);
    }

    private static void countWithStreams( String input) {
    
        throw new UnsupportedOperationException("Unimplemented method 'countWithStreams'");
    }
}
