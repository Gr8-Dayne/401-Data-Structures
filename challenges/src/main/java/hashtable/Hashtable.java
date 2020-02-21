package hashtable;


import java.util.LinkedList;


// Credit: https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/
// Credit: https://www.sanfoundry.com/java-program-implement-hash-tables-chaining-singly-linked-list/

// Node class with key/value Nodes
class HashNode<K, V> {

    HashNode<K, V> next;
    K key;
    V value;

    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public HashNode<K, V> getNextNode() { return next; }
    public K getThisKey() { return key; }
    public V getThisValue() { return value; }
}

class HashMap<K, V> {

    // HashMap Instantiations
    private LinkedList<HashNode<K, V>> listActual;
    private int listZeroOne;
    private int size;

    // Getters
    public LinkedList<HashNode<K, V>> getListActual() { return listActual; }
    public int getListZeroOne() { return listZeroOne; }
    public int getSize() { return size; }

    @Override
    public String toString() {
        return "HashMap{" + "listActual=" + listActual + ", listZeroOne=" + listZeroOne + ", size=" + size + '}';
    }

    // Constructor to create capacity, "size" and empty placeholder nodes for future use
    public HashMap() {

        listActual = new LinkedList<>();
        listZeroOne = 10;
        size = 0;

        // Create empty "chains" by using "null Nodes" as placeholders
        for (int i = 0; i < listZeroOne; i++)
            listActual.add(null);
    }

    // SIZE METHOD
    public int size() { return size; }

    // CHECK EMPTY METHOD
    public boolean isEmpty() { return size() == 0; }

    //
    // CONTAINS METHOD
    //
    public boolean contains(K input) {

        for(HashNode<K, V> item : listActual){

            System.out.println();
            System.out.println(item.key);
            System.out.println(item.value);
            System.out.println(item.next);

            if(input.equals(item.getThisKey())){

                System.out.println();
                System.out.println("Input match: " + input);
                System.out.println();

                return true;
            }
        }
        return false;
    }

    //
    // HASH METHOD
    //
    public int myHash(K key) {
        int index = key.hashCode();
        index %= listActual.size();
        if (index < 0)
            index += listActual.size();
//        System.out.println(key + "\n listActual index: " + index);
        return index;
    }

    // REMOVE KEY METHOD
    public void remove(K key) {

        // Find index w/key
        int listIndex = myHash(key);

        HashNode<K, V> head = listActual.get(listIndex);
        HashNode<K, V> prev = null;

        while (head != null) {

            // If match
            if (head.key.equals(key))
                break;

            // Else
            prev = head;
            head = head.next;
        }

        // If key was not there
        if (head == null)
            return;

        // Reduce size
        size--;

        // Remove key
        if (prev != null)
            prev.next = head.next;
        else
            listActual.set(listIndex, head.next);
    }

    //
    // GET METHOD
    //
    public V get(K key) {

        // Find head of chain for given key
        int listIndex = myHash(key);
        HashNode<K, V> head = listActual.get(listIndex);

        // Search key in chain
        while (head != null) {

            if (head.key.equals(key))
                return head.value;
            head = head.next;
        }

        // If key not found
        return null;
    }

    //
    // ADD METHOD
    //
    public void add(K key, V value) {

        // Find head of chain for given key
        int listIndex = myHash(key);
        HashNode<K, V> head = listActual.get(listIndex);

        // Check if key is already present
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insert new Node
        size++;
        head = listActual.get(listIndex);
        HashNode<K, V> newNode = new HashNode<K, V>(key, value);
        newNode.next = head;
        listActual.set(listIndex, newNode);

        // If load factor goes beyond threshold, then double hash table size
        if ((1.0 * size)/listZeroOne >= 0.7) {

            LinkedList<HashNode<K, V>> temp = listActual;
            listActual = new LinkedList<>();
            listZeroOne = 2 * listZeroOne;
            size = 0;

            for (int i = 0; i < listZeroOne; i++)
                listActual.add(null);
            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }
}


