//Time-Complexity -> O(nlogn)
//Space-Complexity -> O(n)
//Sorting In Place: No
// Stable: Yes 
// type nul > (file_name).(file_type)   -> to create file
// echo "" > filename   -> to create file   

package MergeSorting.com.Suraj;

public class MergeSort {
    public static void main(String[] args) {
        // int[] a = new int[] { 1, 3, 4, 7, 9, 13, 15, 23, 25, 30 };
        // int[] a = new int[] { 30, 25, 23, 15, 13, 9, 7, 4, 3, 1 };
        int[] a = new int[] { 43, 7, 34, 24, 2, 0, 45, 4, 64, 3, 6, 24, 8, -54, -5, 44, 4, -87, 0 };
        mergeSort(a, 0, a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void mergeSort(int[] arr, int startIndex, int endIndex) {
        if (endIndex - startIndex < 2) {
            return;
        }

        int midIndex = (startIndex + endIndex) / 2;
        mergeSort(arr, startIndex, midIndex);
        mergeSort(arr, midIndex, endIndex);
        merge(arr, startIndex, midIndex, endIndex);

    }

    public static void merge(int[] arr, int startIndex, int midIndex, int endIndex) {
        if (arr[midIndex - 1] <= arr[midIndex])
            return;
        int i = startIndex;
        int j = midIndex;
        int tempIndex = 0;

        // Reason of space Complexity
        int[] tempArr = new int[endIndex - startIndex];

        while (i < midIndex && j < endIndex) {
            tempArr[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        System.arraycopy(arr, i, arr, startIndex + tempIndex, midIndex - i);
        System.arraycopy(tempArr, 0, arr, startIndex, tempIndex);

    }
}