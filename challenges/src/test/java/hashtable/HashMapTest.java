package hashtable;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class HashMapTest {

    HashMap<String, Integer> soap = new HashMap<>();

    @Before
    public void preMobilize() {
        soap.add("bravo", 1);
        soap.add("six", 2);
        soap.add("going", 4);
        soap.add("dark", 5);
    }

    //
    // Only the Node at index one of listActual is ever read and checked. Would you look at it and see what I am missing?
    //
    @Test
    public void containsTest() {

//        System.out.println(soap.contains("bravo"));
//        System.out.println(soap.contains("six"));
//        System.out.println(soap.contains("going"));
//        System.out.println(soap.contains("dark"));

        assertTrue(soap.contains("six"));
    }
    //
    //
    //

    @Test
    public void isEmptyTest() {
        assertTrue(soap.isEmpty());
    }

    @Test
    public void isNotEmptyTest() {
        soap.add("this", 1);
        assertFalse(soap.isEmpty());
    }

    @Test
    public void myHashTest() {
        assertEquals(8, soap.myHash("bravo"));
        assertEquals(0, soap.myHash("six"));
        assertEquals(2, soap.myHash("going"));
        assertEquals(8, soap.myHash("dark"));
    }

    @Test
    public void getTest() {
        int actual1 = soap.get("bravo");
        assertEquals(1, actual1);
        int actual2 = soap.get("six");
        assertEquals(2, actual2);
        int actual3 = soap.get("going");
        assertEquals(4, actual3);
        int actual4 = soap.get("dark");
        assertEquals(5, actual4);
    }

    @Test
    public void addTest() {
        assertEquals(0, soap.getSize());
        soap.add("price", 1);
        assertEquals(1, soap.getSize());
    }

    @Test
    public void removeTest() {
        assertEquals(4, soap.getSize());
        soap.remove("going");;
        assertEquals(3, soap.getSize());
    }

    @Test
    public void sizeTest() {
        assertEquals(3, soap.getSize());
        soap.add("dark", 3);
        assertEquals(4, soap.getSize());
    }
}