package utilities;


import org.junit.Test;
import static org.junit.Assert.*;


// Credit: https://www.journaldev.com/13244/java-queue
public class AnimalShelterTest {

    AnimalShelter animalHouse = new AnimalShelter();

    Animal oneDog = new Dog("Cooper");
    Animal oneCat = new Cat("Mousya");
    Animal twoDog = new Dog("Ryder");
    Animal twoCat = new Cat("Tiger");

    @Test public void enqueueTest() {

        animalHouse.enqueue((Dog) oneDog);
        animalHouse.enqueue((Dog) twoDog);
        animalHouse.enqueue((Cat) oneCat);
        animalHouse.enqueue((Cat) twoCat);

        Animal actual = animalHouse.dequeue("cat");
        assertEquals(oneCat.name, actual.name);
    }

    @Test public void dequeueTest() {

        animalHouse.enqueue((Cat) oneCat);
        animalHouse.enqueue((Dog) oneDog);
        animalHouse.enqueue((Cat) twoCat);
        animalHouse.enqueue((Dog) twoDog);

        animalHouse.dequeue("dog");

        Animal actual = animalHouse.dequeue("dog");
        assertEquals(twoDog.name , actual.name);
    }
}