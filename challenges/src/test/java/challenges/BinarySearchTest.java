
package challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test public void testBinaryStuff() {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int key = 1;

        int actualOutput = BinarySearch.BinarySearcher(arr, key);

        System.out.println("actualOutput = " + actualOutput);

        assertEquals(0, actualOutput);

    }

}

        
//        assertArrayEquals(arr, key);

//        // Target int in array
//        int targetNum = 3;
//
//        // Array
//        int[] exampleArray = {1,2,3,4,5,6};
//
//        // Result
//        int[] actualOutput = BinarySearch.BinarySearcher();
//
//        // "Function" call
//        assertArrayEquals(desiredOutput, actualOutput);


        // Target int not in array
//        int insertionTwo = 80;
//
//        // Starter array
//        int[] testerTwo = { 10, 20, 30, 40 };
//        // Goal
//        int[] desiredOutputTwo = { 10, 20, 80, 30, 40 };
//        // Result
//        int[] actualOutputTwo = ArrayShift.arrayShiftAndInsert(testerTwo, insertionTwo);
//
//        // "Function" call
//        assertArrayEquals(desiredOutputTwo, actualOutputTwo);

