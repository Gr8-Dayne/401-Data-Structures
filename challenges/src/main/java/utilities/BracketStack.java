package utilities;


public class BracketStack<E> {

    AnimalNode<E> top;

    public void push(E numberVal) {
        top = new AnimalNode(numberVal, top);
    }

    public E pop() {
        E popVal = top.valueData;
        top = top.next;
        return popVal;
    }

    public E peek() {
        return top.valueData;
    }

    public boolean isEmpty() {
        if(top == null){
            return true;
        }
        return false;
    }
}
