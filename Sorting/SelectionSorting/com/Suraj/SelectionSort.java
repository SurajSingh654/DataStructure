//Time-Complexity -> O(n^2)
//Space-Complexity -> O(1)
// Sorting In Place: Yes
// Stable: No    {could make stable}

package SelectionSorting.com.Suraj;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // int[] a = new int[] { 1, 3, 4, 7, 9, 13, 15, 23, 25, 30 };
        int[] a = new int[] { 30, 25, 23, 15, 13, 9, 7, 4, 3, 1 };
        long start = System.nanoTime();
        for (int lastSortedIndex = 0; lastSortedIndex < a.length; lastSortedIndex++) {
            boolean isSort = true; // optimization
            for (int i = lastSortedIndex + 1; i < a.length; i++) {
                if (a[lastSortedIndex] > a[i]) {
                    isSort = false;
                    int temp = a[lastSortedIndex];
                    a[lastSortedIndex] = a[i];
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