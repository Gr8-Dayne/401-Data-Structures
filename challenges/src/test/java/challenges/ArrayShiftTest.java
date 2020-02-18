package challenges;

import init_challenges.ArrayShift;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {

    @Test public void testArrayShiftAndInsert() {

        // Test uneven
        // Element to insert
        int insertion = 42;

        // Starter array
        int[] tester = { 1, 2, 3, 4, 5 };
        // Goal
        int[] desiredOutput = { 1, 2, 3, 42, 4, 5 };
        // Result
        int[] actualOutput = ArrayShift.arrayShiftAndInsert(tester, insertion);

        // "Function" call
        assertArrayEquals(desiredOutput, actualOutput);

        // Test even
        // Element to insert
        int insertionTwo = 80;

        // Starter array
        int[] testerTwo = { 10, 20, 30, 40 };
        // Goal
        int[] desiredOutputTwo = { 10, 20, 80, 30, 40 };
        // Result
        int[] actualOutputTwo = ArrayShift.arrayShiftAndInsert(testerTwo, insertionTwo);

        // "Function" call
        assertArrayEquals(desiredOutputTwo, actualOutputTwo);
    }
}