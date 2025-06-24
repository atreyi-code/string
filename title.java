public class title {
    public static void main(String[] args) {
        String input = "java is a powerful language";

        String titleCase = toTitleCase(input);
        System.out.println("Original: " + input);
        System.out.println("Title Case: " + titleCase);
    }

    // Method to convert to title case
    public static String toTitleCase(String str) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isSpaceChar(c)) {
                result.append(c);
                capitalizeNext = true;
            } else if (capitalizeNext) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(Character.toLowerCase(c));
            }
        }

        return result.toString();
    }
}

    

