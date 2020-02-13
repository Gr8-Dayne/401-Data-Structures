package packageofsorts;

import java.util.Arrays;

public class OfSorts {

    //
    // 02/11/2020
    //

    // Credit: https://www.geeksforgeeks.org/insertion-sort/
    public static int[] insertionSort(int[] arr) {

        if (arr.length == 0){
            throw new IllegalArgumentException("Empty Array Detected - Operation Aborted");
        }

        int arrIndexLength = arr.length;

        for (int i = 1; i < arrIndexLength; ++i) {

            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }

    // Credit: https://www.geeksforgeeks.org/bubble-sort/
    public static String printArray(int[] arr) {
        return Arrays.toString(arr);
    }

    //
    // 02/12/2020
    //

    public static int[] mergeSort(int[] arr) {

        // MergeSort
//        ALGORITHM Mergesort(arr)
//                DECLARE n <-- arr.length

//        if n > 1
//          DECLARE mid <-- n/2
//          DECLARE left <-- arr[0...mid]
//          DECLARE right <-- arr[mid...n]
//          // sort the left side
//          Mergesort(left)
//          // sort the right side
//          Mergesort(right)
//          // merge the sorted left and right sides together
//          Merge(left, right, arr)

        int arrIndexLength = arr.length;

        if (arrIndexLength == 0){
            throw new IllegalArgumentException("Empty Array Detected - Operation Aborted");

        } else if (arrIndexLength > 1){

            int mid = arrIndexLength/2;
//            int left = arr[0 to mid];
//            int right = arr[mid to arrIndexLength];
        }
        return arr;
    }

        // Merge
//        ALGORITHM Merge(left, right, arr)
//          DECLARE i <-- 0
//          DECLARE j <-- 0
//          DECLARE k <-- 0

//        while i < left.length && j < right.length
//          if left[i] <= right[j]
//              arr[k] <-- left[i]
//              i <-- i + 1
//          else
//              arr[k] <-- right[j]
//              j <-- j + 1

//          k <-- k + 1

//        if i = left.length
//            set remaining entries in arr to remaining values in right
//        else
//            set remaining entries in arr to remaining values in left

    //
    // 02/13/2020
    //

    public static int[] quickSort(int[] arr, int[] left, int[] right){

        int arrIndexLength = arr.length;
        int mid = arrIndexLength/2;
//        int left = arr[0 to mid];
//        int right = arr[mid to arrIndexLength];

        if (arrIndexLength == 0){
            throw new IllegalArgumentException("Empty Array Detected - Operation Aborted");

        }

//        else if (left < right){
//        }

//    ALGORITHM QuickSort(arr, left, right)
//    if left < right
        // Partition the array by setting the position of the pivot value
//    DEFINE position <-- Partition(arr, left, right)
        // Sort the left
//    QuickSort(arr, left, position - 1)
        // Sort the right
//    QuickSort(arr, position + 1, right)

//    ALGORITHM Partition(arr, left, right)
        // set a pivot value as a point of reference
//    DEFINE pivot <-- arr[right]
        // create a variable to track the largest index of numbers lower than the defined pivot
//    DEFINE low <-- left - 1
//            for i <- left to right do
//            if arr[i] <= pivot
//    low++
//    Swap(arr, i, low)

        // place the value of the pivot location in the middle.
        // all numbers smaller than the pivot are on the left, larger on the right.
//    Swap(arr, right, low + 1)
        // return the pivot index point
//     return low + 1

//    ALGORITHM Swap(arr, i, low)
//    DEFINE temp;
//    temp <-- arr[i]
//    arr[i] <-- arr[low]
//    arr[low] <-- temp

        return arr;
    }
}


