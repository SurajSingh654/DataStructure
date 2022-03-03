package MoveAllXToEnd;

public class moveXToEnd {
    public static void addXToEnd(String s, int index, int totalX, String newString) {
        if (index == s.length() - 1) {
            for (int i = 0; i < totalX; i++)
                newString += "x";
            System.out.println(newString);
            return;
        }
        if (s.charAt(index) != 'x') {
            newString += s.charAt(index);
            addXToEnd(s, index + 1, totalX, newString);
        } else {
            totalX++;
            addXToEnd(s, index + 1, totalX, newString);
        }

    }

    public static void main(String args[]) {
        addXToEnd("dmckdwkxxmdkxmsmxsk", 0, 0, "");
    }
}
// TimeComplexity O(n)