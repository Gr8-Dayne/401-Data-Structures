package packageofsorts;


import java.util.Arrays;
import java.util.NoSuchElementException;


public class OfSorts {

    //
    // Code Challenge 26
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
    // Code Challenge 27
    //

    // Credit: https://www.geeksforgeeks.org/merge-sort/
    // Credit: https://www.vogella.com/tutorials/JavaAlgorithmsMergesort/article.html
    public static int[] mergeSort(int[] pa) {

        int distance = pa.length;
        int m = distance / 2;

        // Credit: In-Class Code Review
        int[] l = Arrays.copyOfRange(pa, 0, m);
        int[] r = Arrays.copyOfRange(pa, m, distance);

        if (distance == 0){
            System.out.println(" ");
            System.out.println("-----OPERATION ABORTED-----");
            throw new NoSuchElementException("UNABLE TO ACCEPT EMPTY ARRAY");

        } else if (distance == 1) {
            return pa;

        } else if (distance > 1) {
            mergeSort(l);
            mergeSort(r);
            merge(pa, l, r, m, distance - m);
        }
        return pa;
    }

    // Credit: https://www.baeldung.com/java-merge-sort
    // Credit: https://stackabuse.com/merge-sort-in-java/
    private static void merge(int[] pa, int[] l, int[] r, int numOne, int numTwo) {

        int i = 0, j = 0, k = 0;

        while (i < numOne && j < numTwo) {
            if (l[i] <= r[j]) {
                pa[k++] = l[i++];
            } else {
                pa[k++] = r[j++];
            }
        }
        while (i < numOne) {
            pa[k++] = l[i++];
        }
        while (j < numTwo) {
            pa[k++] = r[j++];
        }
    }

    //
    // Code Challenge 28
    //

    // Credit: I have a source for the below code but I forgot the website, I will find it for submission of "Code Challenge 28 - Quick Sort"
    public void quickSort(int [] arr, int left, int right){

        if(left < right){
            int position = partition(arr, left, right);
            quickSort(arr, left, position -1);
            quickSort(arr, position + 1, right);
        }
    }

    public int partition(int [] arr, int left, int right){

        int pivot = arr[right];
        int low = left -1;

        for(int i = left; i <right; i++){
            if(arr[i] <= pivot) {
                low++;
                swap(arr, i, low);
            }
        }
        swap(arr, right, low +1);
        return low + 1;
    }

    public void swap(int [] arr, int i, int low){

        int temp;
        temp = arr[i];
        arr[i]= arr[low];
        arr[low]= temp;
    }
}


