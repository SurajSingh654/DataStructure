package KeypadCombinations;

public class keypadCombinations {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKeypadCombinations(String s, int index, String combination) {
        if (index == s.length()) {
            System.out.println(combination);
            return;
        }
        char currentChar = s.charAt(index);
        String mapping = keypad[currentChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printKeypadCombinations(s, index + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String args[]) {
        printKeypadCombinations("23", 0, "");
    }
}
// TomeComplexity O(4^n)