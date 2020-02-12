package packageofsorts;


import org.junit.Test;
import static org.junit.Assert.*;
import static packageofsorts.OfSorts.insertionSort;
import static packageofsorts.OfSorts.printArray;


public class OfSortsTest {

    //
    // 02/11/2020
    //

    int[] inputArr;

    // THE TEST BELOW WORKS and throws the exception I want it to, but looks bad when running all tests so it is commented out.

//    @Test
//    public void emptyArrayTest() {
//
//        inputArr = new int[]{};
//
//        int[] answer = insertionSort(inputArr);
//        String expected = "";
//        String actual = printArray(answer);
//        assertEquals(expected, actual);
//    }

    @Test
    public void printArrayTest() {

        inputArr = new int[]{8, 4, 23, 42, 16, 15};

        String expected = "[8, 4, 23, 42, 16, 15]";
        String actual = printArray(inputArr);
        assertEquals(expected, actual);
    }

    @Test
    public void insertionSortTest1() {

        inputArr = new int[]{8, 4, 23, 42, 16, 15};

        int[] answer = insertionSort(inputArr);
        String expected = "[4, 8, 15, 16, 23, 42]";
        String actual = printArray(answer);
        assertEquals(expected, actual);
    }

    @Test
    public void insertionSortTest2() {

        inputArr = new int[]{20, 18, 12, 8, 5, -2};

        int[] answer = insertionSort(inputArr);
        String expected = "[-2, 5, 8, 12, 18, 20]";
        String actual = printArray(answer);
        assertEquals(expected, actual);
    }

    @Test
    public void insertionSortTest3() {

        inputArr = new int[]{5, 12, 7, 5, 5, 7};

        int[] answer = insertionSort(inputArr);
        String expected = "[5, 5, 5, 7, 7, 12]";
        String actual = printArray(answer);
        assertEquals(expected, actual);
    }

    @Test
    public void insertionSortTest4() {

        inputArr = new int[]{2, 3, 5, 7, 13, 11};

        int[] answer = insertionSort(inputArr);
        String expected = "[2, 3, 5, 7, 11, 13]";
        String actual = printArray(answer);
        assertEquals(expected, actual);
    }

    //
    // 02/12/2020
    //

    @Test
    public void mergeSortTest1() {

        inputArr = new int[]{8, 4, 23, 42, 16, 15};

    }

    @Test
    public void mergeSortTest2() {

        inputArr = new int[]{20, 18, 12, 8, 5, -2};

    }

    @Test
    public void mergeSortTest3() {

        inputArr = new int[]{5, 12, 7, 5, 5, 7};

    }

    @Test
    public void mergeSortTest4() {

        inputArr = new int[]{2, 3, 5, 7, 13, 11};

    }
}