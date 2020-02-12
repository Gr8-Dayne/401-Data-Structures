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
}


