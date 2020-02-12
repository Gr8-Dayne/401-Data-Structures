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

        if (arr.length == 0){
            throw new IllegalArgumentException("Empty Array Detected - Operation Aborted");
        }

//        int arrIndexLength = arr.length;
//
//        for (int i = 1; i < arrIndexLength; ++i) {
//
//            int temp = arr[i];
//            int j = i - 1;
//
//            while (j >= 0 && arr[j] > temp) {
//                arr[j + 1] = arr[j];
//                j = j - 1;
//            }
//            arr[j + 1] = temp;
//        }
        return arr;
    }
}
