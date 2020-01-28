package utilities;

import org.junit.Test;

import static org.junit.Assert.*;
import static utilities.MultiBracketValidation.multiBracketValidation;

public class MultiBracketValidationTest {

//    @Test public void multiBracketValidationTest() {
//
//        assertEquals('()', );
//        assertEquals('[]', );
//        assertEquals('{}', );
//    }

    @Test public void smoothBoisTest() {

        boolean expected = true;
        boolean actual = multiBracketValidation("(e)");
        assertEquals(expected, actual);
    }

//    @Test public void straightBoisTest() {
//
//        String expected = '[]';
//        String actual =
//        assertEquals(expected, actual);
//    }
//
//    @Test public void curvyBoisTest() {
//
//        String expected = '{}';
//        String actual =
//        assertEquals(expected, actual);
//    }
}


// '()' || '[]' || '{}'