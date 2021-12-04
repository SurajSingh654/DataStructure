//Time-Complexity -> O(n^2)
//Space-Complexity -> O(1)
// Sorting In Place: Yes
// Stable: No    

package ShellSorting.com.Suraj;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        // int[] a = new int[] { 1, 3, 4, 7, 9, 13, 15, 23, 25, 30 };
        int[] a = new int[] { 30, 25, 23, 15, 13, 9, 7, 4, 3, 1 };
        for (int gap = a.length / 2; gap >= 1; gap /= 2) {
            for (int i = gap; i < a.length; i++) {
                int newElement = a[i];
                int j;
                for (j = i; j - gap >= 0 && a[j - gap] > newElement; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = newElement;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
