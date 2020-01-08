package challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test public void testArrayShiftCheck() {
        ArrayShift classUnderTest = new ArrayShift();
        assertTrue("ArrayShiftCheck should return 'true'", classUnderTest.ArrayShiftCheck());
    }
}
