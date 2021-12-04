//Time-Complexity -> O(n^2)
//Space-Complexity -> O(1)
// Sorting In Place: Yes
// Stable: Yes    {could make stable}
// Make Recursive Insertion Sort
package InsertionSorting.com.Suraj;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // int[] a = new int[] { 1, 3, 4, 7, 9, 13, 15, 23, 25, 30 };
        int[] a = new int[] { 30, 25, 23, 15, 13, 9, 7, 4, 3, 1 };
        for (int firstunsortedIndex = 1; firstunsortedIndex < a.length; firstunsortedIndex++) {
            int newElement = a[firstunsortedIndex];
            int j;
            for (j = firstunsortedIndex - 1; j >= 0 && a[j] > newElement; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = newElement;
        }
        System.out.println(Arrays.toString(a));
    }
}