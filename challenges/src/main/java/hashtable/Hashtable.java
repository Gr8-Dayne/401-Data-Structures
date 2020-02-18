package hashtable;


import java.util.ArrayList;


public class Hashtable {

    int size;
    String[] map;

    public Hashtable (int size){
        this.size = size;
        this.map = new String[size];
    }

    // Takes in an arbitrary key and returns an index in the collection.
    private int hash(String key) {
        int hashValue = 0;

        for(int i = 0; i < key.length(); i++) {
            hashValue += (int) key.charAt(i);
        }
        hashValue = (hashValue * 599) % this.size;

        return hashValue;
    }

    // This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
    public void add(Integer key, String value) {

        System.out.println("key.toString: " + key.toString());
        System.out.println("key.toString: " + value);

        int hashKey = hash(key.toString());
        this.map[hashKey] = value;
    }

    // Takes in the key and returns the value from the table.
    public String get(Integer key) {

        return null;
    }

    // Takes in the key and returns a boolean, indicating if the key exists in the table already.
    public boolean contains(Integer key) {

        return true;
    }
}


