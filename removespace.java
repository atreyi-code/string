public class removespace {
    public static void main(String[] args) {
        String input = "Hello World From Java";
        String result = removeSpaces(input);
        
        System.out.println("Original: " + input);
        System.out.println("Without spaces: " + result);
    }
public static String removeSpaces(String str) {
        StringBuilder noSpaces = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                noSpaces.append(c);
            }
        }

        return noSpaces.toString();
    }
}

    

