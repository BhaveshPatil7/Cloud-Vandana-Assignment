public class JavaC {
    public static void main(String[] args) {
        String input = "My name is bhavesh patil"; // Replace with your input

        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        input = input.toLowerCase(); // Convert the input to lowercase for case-insensitive check
        boolean[] isPresent = new boolean[26]; // Array to track letter presence (a-z)

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                isPresent[c - 'a'] = true;
            }
        }

        for (boolean letterPresent : isPresent) {
            if (!letterPresent) {
                return false; // If any letter is not present, it's not a pangram
            }
        }

        return true; // All letters are present, it's a pangram
    }
}
