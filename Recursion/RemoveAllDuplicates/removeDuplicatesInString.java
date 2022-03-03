package RemoveAllDuplicates;

public class removeDuplicatesInString {
    private static boolean[] alphabetArray = new boolean[26];

    public static void removeDuplicates(String s, int index, String newString) {
        char currentChar = s.charAt(index);
        if (index == s.length() - 1) {
            System.out.println(newString);
            return;
        }
        if (alphabetArray[currentChar - 'a']) {
            removeDuplicates(s, index + 1, newString);
        } else {
            newString += currentChar;
            alphabetArray[currentChar - 'a'] = true;
            removeDuplicates(s, index + 1, newString);
        }
    }

    public static void main(String args[]) {
        removeDuplicates("aaaaabbbbbfdddddggggdddd", 0, "");
    }
}
// TimeComplexity O(n)