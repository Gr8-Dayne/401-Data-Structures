package hashtable;


// Node class with key/value Nodes
public class PainfulExp {

    PainfulExp next;
    String key;
    Integer value;

    public PainfulExp(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public PainfulExp getNext() { return next; }
    public String getKey() { return key; }
    public Integer getValue() { return value; }
}


