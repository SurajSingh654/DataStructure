package ReverseString;

public class reverseString {
    public static void printReverseString(String s, int length, int index) {
        if (index == length) {
            return;
        }
        // System.out.println(s.charAt(index)); // Print String
        printReverseString(s, length, index + 1);
        System.out.print(s.charAt(index)); // Print String in Reverse Order

    }

    public static void main(String args[]) {
        String s = "Hello Miss";
        printReverseString(s, s.length(), 0);
    }
}

// Time Complexity O(n)
