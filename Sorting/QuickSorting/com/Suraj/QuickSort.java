//Time-Complexity -> O(nlogn)
//Space-Complexity -> O(1)
// Sorting In Place: Yes
// Stable: No

package QuickSorting.com.Suraj;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        // int[] a = new int[] { 1, 3, 4, 7, 9, 13, 15, 23, 25, 30 };
        // int[] a = new int[] { 30, 25, 23, 15, 13, 9, 7, 4, 3, 1 };
        int[] a = new int[] { 43, 7, 34, 24, 2, 0, 45, 4, 64, 3, 6, 24, 8, -54, -5, 44, 4, -87, 0 };
        // int[] a = new int[] { 20, 35, -15, 7, 55, 1, -22 };
        System.out.println(Arrays.toString(a));
        QuickSort qSort = new QuickSort();
        qSort.quickSort(a, 0, a.length);
        System.out.println(Arrays.toString(a));
    }

    public void quickSort(int[] arr, int startIndex, int endIndex) {
        if (endIndex - startIndex < 2) {
            return;
        }

        int pivotIndex = partition(arr, startIndex, endIndex);
        quickSort(arr, startIndex, pivotIndex);
        quickSort(arr, pivotIndex + 1, endIndex);
    }

    public int partition(int[] arr, int startIndex, int endIndex) {
        int i = startIndex;
        int j = endIndex;
        int pivot = arr[startIndex];

        while (i < j) {
            while (i < j && arr[--j] >= pivot)
                ;
            if (i < j) {
                arr[i] = arr[j];
            }
            while (i < j && arr[++i] <= pivot)
                ;
            if (i < j) {
                arr[j] = arr[i];
            }
            System.out.println(Arrays.toString(arr));
        }
        arr[j] = pivot;
        return j;
    }

}
