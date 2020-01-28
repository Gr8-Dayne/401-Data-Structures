package utilities;


import java.util.Queue;


// Credit: https://stackoverflow.com/questions/5176767/a-queue-with-different-data-types-in-java
// Credit: https://stackoverflow.com/questions/4626812/how-do-i-instantiate-a-queue-object-in-java
public class AnimalShelter {

    public AnimalQueue<Cat> catQueue;
    public AnimalQueue<Dog> dogQueue;

    public AnimalShelter() {
        // Idea given to me by TA James
        dogQueue = new AnimalQueue<Dog>();
        catQueue = new AnimalQueue<Cat>();
    }

    // Enqueue
    // Adds animal to the shelter, animal can be either a dog or a cat object
    public void enqueue(Dog dog){dogQueue.enqueue(dog);}
    public void enqueue(Cat cat){catQueue.enqueue(cat);}

    // Dequeue
    // Returns either a dog or a cat, if pref is not "dog" or "cat" then return null
    public Animal dequeue(String pref){

        if (pref.equals("cat")){
            return catQueue.dequeue();
        }
        else if (pref.equals("dog")){
            return dogQueue.dequeue();
        }

        // Credit: https://docs.oracle.com/javase/7/docs/api/java/lang/IllegalArgumentException.html
        throw new IllegalArgumentException("Please pick 'cat' or 'dog'");
    }
}
