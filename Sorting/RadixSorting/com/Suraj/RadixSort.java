//Time-Complexity -> O(width*(n+radix))
//Space-Complexity -> O(Max)
// Sorting In Place: No
// Stable: Yes 
package RadixSorting.com.Suraj;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {

        // int[] a = new int[] { 1, 3, 4, 7, 9, 13, 15, 23, 25, 30 };
        // int[] a = new int[] { 30, 25, 23, 15, 13, 9, 7, 4, 3, 1 };
        // int[] a = new int[] { 43, 7, 34, 24, 2, 0, 45, 4, 64, 3, 6, 24, 8, -54, -5,
        // 44, 4, -87, 0 };
        // int[] a = new int[] { 20, 35, -15, 7, 55, 1, -22 };
        // int[] a = new int[] { -1, -2, 6, 0, 4, 5, 4, 5, 4, 6, 3, -4, 5 };
        int[] a = new int[] { 3722, 4322, 4545, 3433, 3444, 7546, 3554 };
        radixSort(a, 10, 4);
        System.out.println(Arrays.toString(a));
    }

    public static void radixSort(int[] arr, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(arr, i, radix);
        }
    }

    public static void radixSingleSort(int[] arr, int position, int radix) {
        int numItems = arr.length;
        int[] countArray = new int[radix];
        for (int value : arr) {
            countArray[getPosition(position, value, radix)]++;
        }
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] tempArray = new int[numItems];

        for (int i = numItems - 1; i >= 0; i--) {
            tempArray[--countArray[getPosition(position, arr[i], radix)]] = arr[i];
        }
        System.out.println(Arrays.toString(tempArray));
    }

    public static int getPosition(int position, int value, int radix) {
        return value / (int) Math.pow(10, position) % radix;
    }
}