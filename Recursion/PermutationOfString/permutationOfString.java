package PermutationOfString;

public class permutationOfString {
    public static void printAllPermutationsOfString(String s, String permutation) {
        if (s.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            String subStr = s.substring(0, i) + s.substring(i + 1);
            printAllPermutationsOfString(subStr, permutation + currentChar);

        }
    }

    public static void main(String args[]) {
        String str = "abc";
        printAllPermutationsOfString(str, "");
    }
}
// TimeComplexity O(n!)
