//Time-Complexity -> O(n^2)
//Space-Complexity -> O(1)
// Sorting In Place: Yes
// Stable: Yes

package BubbleSorting.com.Suraj;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = new int[] { 1, 3, 4, 7, 9, 13, 15, 23, 25, 30 };
        // int[] a = new int[] { 30, 25, 23, 15, 13, 9, 7, 4, 3, 1 };
        long start = System.nanoTime();
        for (int lastUnSortedIndex = a.length - 1; lastUnSortedIndex >= 0; lastUnSortedIndex--) {
            boolean isSort = true; // optimization
            for (int i = 1; i <= lastUnSortedIndex; i++) {
                if (a[i - 1] > a[i]) {
                    isSort = false;
                    int temp = a[i - 1];
                    a[i - 1] = a[i];
                    a[i] = temp;
                }
            }
            if (isSort == true)
                break;
        }
        System.out.println(Arrays.toString(a));

        long end = System.nanoTime();
        System.out.print("Execution time is " + (end - start) + " nanoseconds");

    }
}