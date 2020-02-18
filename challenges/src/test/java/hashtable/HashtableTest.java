package hashtable;


import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class HashtableTest {

    Hashtable stringVault = new Hashtable(8);

    @Test
    public void hashTest() {
        stringVault.add(1, "Mattäus");
        stringVault.add(2, "Sergei");
        stringVault.add(3, "Shane");
        stringVault.add(4, "Daisy");
        stringVault.add(5, "Dayne");

        // What is going on here?
        int expected = 1;
        int actual = stringVault.hash("Shane");
        assertEquals(expected, actual);
    }

    @Test
    public void addTest() {
        stringVault.add(1, "Mattäus");
        stringVault.add(2, "Sergei");
        stringVault.add(3, "Shane");
        stringVault.add(4, "Daisy");
        stringVault.add(5, "Dayne");

    }

    @Test
    public void getTest() {
        stringVault.add(1, "Mattäus");
        stringVault.add(2, "Sergei");
        stringVault.add(3, "Shane");
        stringVault.add(4, "Daisy");
        stringVault.add(5, "Dayne");

    }

    @Test
    public void containsTest() {
        stringVault.add(1, "Mattäus");
        stringVault.add(2, "Sergei");
        stringVault.add(3, "Shane");
        stringVault.add(4, "Daisy");
        stringVault.add(5, "Dayne");
        stringVault.add(6, "Annie");
        stringVault.add(7, "Pete");
        stringVault.add(8, "Micah");
        stringVault.add(9, "Martin");
        stringVault.add(10, "Phong");
        stringVault.add(11, "Jerome");

    }

    @Test
    public void emptyHashtableTest() {

    }
}

//    Adding a key/value to your hashtable results in the value being in the data structure

//    Retrieving based on a key returns the value stored

//    Successfully returns null for a key that does not exist in the hashtable

//    Successfully handle a collision within the hashtable

//    Successfully retrieve a value from a bucket within the hashtable that has a collision

//    Successfully hash a key to an in-range value


