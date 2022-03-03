package SubSequencesOfString;

import java.util.HashSet;

public class subSequencesOfString {
    public static void printSubSequences(String s, int index, String newString, HashSet<String> set) {
        if (index == s.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentChar = s.charAt(index);
        printSubSequences(s, index + 1, newString + currentChar, set);
        printSubSequences(s, index + 1, newString, set);

    }

    public static void main(String args[]) {
        String str = "aaac";
        HashSet<String> set = new HashSet<>();
        printSubSequences(str, 0, "", set);
    }
}
// All the strings made from given string {Order of Characters Should Be
// Maintained}
// TimeComplexity O(2^n+1)