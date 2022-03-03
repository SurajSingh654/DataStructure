package SortedArrayStrictlyIncreasing;

public class sortedArrayStrictlyIncreasing {
    public static boolean isSortedArrayStrictlyIncreasing(int[] array, int index) {
        if (index == array.length - 1) {
            return true;
        }
        if (array[index] >= array[index + 1])
            return false;
        return isSortedArrayStrictlyIncreasing(array, index + 1);
    }

    public static void main(String args[]) {
        int[] array = new int[] { 1, 4, 8, 9, 10, 4 };
        System.out.println(isSortedArrayStrictlyIncreasing(array, 0));

    }
}
// Time Complexity O(n)