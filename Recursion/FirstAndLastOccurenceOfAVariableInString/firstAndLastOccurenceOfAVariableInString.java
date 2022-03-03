package FirstAndLastOccurenceOfAVariableInString;

public class firstAndLastOccurenceOfAVariableInString {
    private static boolean printFirstOccurence = false;
    private static boolean printLastOccurence = false;

    public static void printFirstAndLastOccurence(String s, char variable, int index) {
        if (index == s.length() - 1) {
            return;
        }
        if (s.charAt(index) == variable && !printFirstOccurence) {
            System.out.println("First occurence of " + variable + " is at index " + index);
            printFirstOccurence = true;
        }
        printFirstAndLastOccurence(s, variable, index + 1);
        if (s.charAt(index) == variable && !printLastOccurence) {
            System.out.println("Last occurence of " + variable + " is at index " + index);
            printLastOccurence = true;
        }
    }

    public static void main(String args[]) {
        printFirstAndLastOccurence("dfbsfskjddakjdhhdaodcnsc", 'z', 0);
    }
}
