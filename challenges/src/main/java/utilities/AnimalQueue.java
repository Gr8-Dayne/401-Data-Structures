package utilities;


import java.util.NoSuchElementException;


public class AnimalQueue<E> {

    public AnimalNode<E> front;
    public AnimalNode<E> back;

    public void enqueue(E value) {
        if (front == null){
            front = new AnimalNode<E>(value, null);
            back = front;
        } else {
            back.next = new AnimalNode<E>(value, null);
            back = back.next;
        }
    }
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("This queue is empty");
        } else if (front == back) {
            AnimalNode<E> runner = front;
            front = back = null;
            return runner.valueData;
        } else {
            AnimalNode<E> current = front;
            front = front.next;
            return current.valueData;
        }
    }
    public boolean isEmpty() {
        return front == null;
    }
}


