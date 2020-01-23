package utilities;


import java.util.LinkedList;


public class AnimalShelter {

    // Queue one
    LinkedList<String> catQueue ;
    // Queue two
    LinkedList<String> dogQueue;

    public AnimalShelter() {
        dogQueue = new LinkedList();
        catQueue = new LinkedList();
    }

    // Enqueue
    // Adds animal to the shelter, animal can be either a dog or a cat object
    // Credit: https://docs.oracle.com/javase/7/docs/api/java/lang/IllegalArgumentException.html
    public void enqueue(String animal){

        // Idea given to me by TA James
        // Queue<Dog> dogQueue = new LinkedList<>();

        if (animal.equals("cat")){

            catQueue.addLast(animal);

        } else if (animal.equals("dog")){

            dogQueue.addLast(animal);

        } else {
            throw new IllegalArgumentException("Please pick 'cat' or 'dog'");
        }

    }

    // Dequeue
    // Returns either a dog or a cat, if pref is not "dog" or "cat" then return null
    public void dequeue(String pref){

        if (pref.equals("cat")){

            catQueue.getFirst();

        } else if (pref.equals("dog")){

            dogQueue.getFirst();

        } else {
            throw new IllegalArgumentException("null");
        }
    }
}
