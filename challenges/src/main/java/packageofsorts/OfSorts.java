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

    //
    // Pseudo Code:
    //

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

    // Credit: I have a source for the below code but I forgot the website, I will find it for submission of "Code Challenge 28 - Quick Sort"
    public void quickSort(int [] arr, int left, int right){

        if(left < right){
            int position = partition(arr, left, right);
            quickSort(arr, left, position -1);  //if position is 5(Index of pivot). sorts from 0 to 4
            quickSort(arr, position + 1, right);//if position is 5. sorts from 6 to the end
        }
    }

    public int partition(int [] arr, int left, int right){

        //left is 0
        //right is 5
        int pivot = arr[right];  //sets pivot as the last item in the array
        int low = left -1; // low starts as -1

        for(int i = left; i <right; i++){
            if(arr[i] <= pivot){  // all items less than the pivot value startint at index 0
                low++;
                swap(arr, i, low);
            }
        }
        swap(arr, right, low +1);
        return low + 1;  // returns index of pivot after rearrangement
    }

    public void swap(int [] arr, int i, int low){

        // low is 0
        // i is 0. index
        // [7,9,3,4,7,1,7]
        int temp;
        temp = arr[i];  //temp = arr[0] =7
        arr[i]= arr[low];  // element at 0 becomes 7
        arr[low]= temp;
    }

    //
    // Pseudo Code:
    //



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
}


