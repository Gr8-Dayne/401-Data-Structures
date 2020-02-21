package hashtable;


import java.util.Arrays;
import java.util.LinkedList;


// Credit: TA James
// Credit: https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/
// Credit: https://www.sanfoundry.com/java-program-implement-hash-tables-chaining-singly-linked-list/
public class HashMap {

    public LinkedList<PainfulExp>[] listActual = new LinkedList[10];

    public HashMap() {

        for(int i = 0; i < listActual.length; i++){

            listActual[i] = new LinkedList<PainfulExp>();
        }
    }

    // SIZE METHOD
    public int size() {

        int lengthActual = listActual.length;

        return lengthActual;
    }

    //
    // CONTAINS METHOD
    //
    public boolean contains(String key){

        int i = hash(key);
        LinkedList<PainfulExp> tempStore = this.listActual[i];

        for(PainfulExp curr : tempStore){
            if(key.equals(curr.getKey())){
                return true;
            }
        }
        return false;
    }

    //
    // HASH METHOD
    //
    public int hash(String key){
        return Math.abs((key == null ? 0 : key.hashCode()) % listActual.length);
    }

    //
    // GET METHOD
    //
    public Integer get(String key){
        int i = hash(key);

        LinkedList<PainfulExp> tempStore = this.listActual[i];

        for(PainfulExp target : tempStore){
            if(key.equals(target.getKey())){
                return target.getValue();
            }
        }
        return null;
    }

    //
    // ADD METHOD
    //
    public boolean add(String key, Integer value){

        boolean result = (!contains(key));

        PainfulExp thingToStore = new PainfulExp(key, value);
        int i = hash(key);

        this.listActual[i].add(thingToStore);

        return result;
    }

    @Override
    public String toString() {
        return "HashMap{" + "listActual=" + Arrays.toString(listActual) + '}';
    }
}


