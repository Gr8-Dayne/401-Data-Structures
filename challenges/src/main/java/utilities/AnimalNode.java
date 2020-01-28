package utilities;

public class AnimalNode<E> {

    public E valueData;
    public AnimalNode<E> next;

    AnimalNode(E valueData, AnimalNode<E> next) {
        this.valueData = valueData;
        this.next = next;
    }
}
