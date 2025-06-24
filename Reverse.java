public class Reverse {
    public static void main(String[] args) {
        String original = "Hello, World!";
        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
