package hashtable;


import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class HashtableTest {

    Hashtable stringVault = new Hashtable(11);

    @Test
    public void hashTest() {
        stringVault.add(1, "Mattäus");
        stringVault.add(2, "Sergei");
        stringVault.add(3, "Shane");

        
        int actual = stringVault.hash("Sergei");

        assertEquals();
    }

    @Test
    public void addTest() {
        stringVault.add(1, "Mattäus");
        stringVault.add(2, "Sergei");
        stringVault.add(3, "Shane");


    }

    @Test
    public void getTest() {

    }

    @Test
    public void containsTest() {

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


