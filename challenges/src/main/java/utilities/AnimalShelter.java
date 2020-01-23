package utilities;


import stacksandqueues.Queue;

import java.util.LinkedList;


public class AnimalShelter {

    // Queue one
    Queue catQueue ;
    // Queue two
    Queue dogQueue;

    public AnimalShelter() {
        dogQueue = new Queue();
        catQueue = new Queue();
    }

    // Enqueue
    // Adds animal to the shelter, animal can be either a dog or a cat object
    // Credit: https://docs.oracle.com/javase/7/docs/api/java/lang/IllegalArgumentException.html
    public void enqueue(String animal){

        // Idea given to me by TA James
        // Queue<Dog> dogQueue = new LinkedList<>();

        if (animal.equals("cat")){

            catQueue.enqueue(animal);

        } else if (animal.equals("dog")){

            dogQueue.enqueue(animal);

        } else {
            throw new IllegalArgumentException("Please pick 'cat' or 'dog'");
        }

    }

    // Dequeue
    // Returns either a dog or a cat, ff pref is not "dog" or "cat" then return null
    public void dequeue(String pref){

    }

}
