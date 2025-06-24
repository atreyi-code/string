public class stringbuilder {
    public static void main(String[] args) {
        // 1. Initialize with some content (not null)
        StringBuilder str = new StringBuilder("Hello");

        // 2. Show original content
        System.out.println("String = " + str.toString());

        // 3. Reverse in place—StringBuilder.reverse() modifies this object
        StringBuilder reverseStr = str.reverse();

        // 4. Show reversed result
        System.out.println("Reversed = " + reverseStr.toString());
    }
}
