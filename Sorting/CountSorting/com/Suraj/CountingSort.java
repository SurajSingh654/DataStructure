//Time-Complexity -> O(n+range(Max-Min))
//Space-Complexity -> O(Max)
// Sorting In Place: No
// Stable: Yes 

package CountSorting.com.Suraj;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        // int[] a = new int[] { 1, 3, 4, 7, 9, 13, 15, 23, 25, 30 };
        // int[] a = new int[] { 30, 25, 23, 15, 13, 9, 7, 4, 3, 1 };
        // int[] a = new int[] { 43, 7, 34, 24, 2, 0, 45, 4, 64, 3, 6, 24, 8, -54, -5,
        // 44, 4, -87, 0 };
        // int[] a = new int[] { 20, 35, -15, 7, 55, 1, -22 };
        int[] a = new int[] { -1, -2, 6, 0, 4, 5, 4, 5, 4, 6, 3, -4, 5 };
        System.out.println(Arrays.toString(a));
        countingSort(a, maxValue(a), minValue(a));
    }

    public static int maxValue(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public static int minValue(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    public static void countingSort(int[] a, int maxValue, int minValue) {
        int[] tempArray = new int[maxValue - minValue + 1];
        Arrays.fill(tempArray, 0);
        for (int i = 0; i < a.length; i++) {
            tempArray[a[i] - minValue]++;
        }
        System.out.println(Arrays.toString(tempArray));
        int k = 0;
        for (int i = 0; i < tempArray.length; i++) {
            while (tempArray[i] > 0) {
                a[k++] = minValue;
                tempArray[i]--;
            }
            minValue++;
        }
        System.out.println(Arrays.toString(a));
    }

}