package hashtable;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class HashMapTest {

    HashMap soap = new HashMap();

    @Before
    public void preMobilize() {
        soap.add("bravo", 1);
        soap.add("six", 2);
        soap.add("going", 4);
        soap.add("dark", 5);
    }

    @Test
    public void containsTest() {
//        System.out.println(soap.contains("bravo"));
//        System.out.println(soap.contains("six"));
//        System.out.println(soap.contains("going"));
//        System.out.println(soap.contains("dark"));
        assertTrue(soap.contains("six"));
    }

    @Test
    public void hashTest() {
        assertEquals(8, soap.hash("bravo"));
        assertEquals(0, soap.hash("six"));
        assertEquals(2, soap.hash("going"));
        assertEquals(8, soap.hash("dark"));
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

    // The last Node in "actual" varies since it is added each time the test is run
    @Test
    public void addTest() {
        soap.add("Price", 3);
        System.out.println("soap = " + soap);
        String expected = "HashMap{listActual=[[hashtable.PainfulExp@3dbb33d1], [], [hashtable.PainfulExp@53b7d5e1], [], [], [], [], [], [hashtable.PainfulExp@28a48afa, hashtable.PainfulExp@66ed52be], []]}";
        String actual =   "HashMap{listActual=[[hashtable.PainfulExp@7f6bb60b], [], [hashtable.PainfulExp@140048d6], [], [], [], [], [], [hashtable.PainfulExp@691f8ab2, hashtable.PainfulExp@1b231f57], [hashtable.PainfulExp@39da29d6]]}";
        assertNotEquals(expected, soap.toString());
    }
}