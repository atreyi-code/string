import java.util.HashMap;

public class characterfrequency {
    public static void main(String[] args) {
        String input = "programming";

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (freqMap.containsKey(c)) {
                freqMap.put(c, freqMap.get(c) + 1);
            } else {
                freqMap.put(c, 1);
            }
        }

        // Display the frequencies
        for (char key : freqMap.keySet()) {
            System.out.println(key + " : " + freqMap.get(key));
        }
    }
}

