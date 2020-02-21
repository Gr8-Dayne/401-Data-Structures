package packageofsorts;


import java.util.Arrays;
import java.util.NoSuchElementException;


public class OfSorts {

    //
    // Code Challenge 26
    //

    // Credit: https://www.geeksforgeeks.org/insertion-sort/
    public static int[] insertionSort(int[] parentArray) {

        if (parentArray.length == 0){
            throw new IllegalArgumentException("Empty Array Detected - Operation Aborted");
        }

        int parentArrayIndexLength = parentArray.length;

        for (int i = 1; i < parentArrayIndexLength; ++i) {

            int temp = parentArray[i];
            int j = i - 1;

            while (j >= 0 && parentArray[j] > temp) {
                parentArray[j + 1] = parentArray[j];
                j = j - 1;
            }
            parentArray[j + 1] = temp;
        }
        return parentArray;
    }

    // Credit: https://www.geeksforgeeks.org/bubble-sort/
    public static String printArray(int[] parentArray) {
        return Arrays.toString(parentArray);
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

    // I had to catch myself back up to speed on this again...
    // Credit: https://howtodoinjava.com/algorithm/quicksort-java-example/
    // Credit: https://www.geeksforgeeks.org/quick-sort/
    // Credit: https://www.baeldung.com/java-quicksort
    // Credit: https://www.programcreek.com/2012/11/quicksort-array-in-java/

    public static int[] quickSort(int[] parentArray, int l, int r){
        if(l < r){
            int position = partition(parentArray, l, r);
            quickSort(parentArray, l, position -1);
            quickSort(parentArray, position + 1, r);
        }
        return parentArray;
    }

    public static int partition(int[] parentArray, int l, int r){

        int pivot = parentArray[r];
        int low = l -1;

        for(int i = l; i <r; i++){
            if(parentArray[i] <= pivot) {
                low++;
                swap(parentArray, i, low);
            }
        }
        swap(parentArray, r, low +1);
        return low + 1;
    }

    public static void swap(int[] parentArray, int i, int low){
        int temp;
        temp = parentArray[i];
        parentArray[i]= parentArray[low];
        parentArray[low]= temp;
    }
}


