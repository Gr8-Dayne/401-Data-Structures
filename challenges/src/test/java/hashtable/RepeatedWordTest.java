package hashtable;


import org.junit.Test;
import static hashtable.RepeatedWord.firstRepeated;
import static org.junit.Assert.*;


public class RepeatedWordTest {

    @Test
    public void firstRepeatedHappyTest() {

        String input = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";

        String actual = firstRepeated(input);
        String expected = "it";

        assertEquals(expected, actual);
    }

    @Test
    public void firstRepeatedFailureTest() {

        String input = "";

        String actual = firstRepeated(input);
        String expected = "";

        assertEquals(expected, actual);
    }


    @Test
    public void firstRepeatedEdgeCaseTest() {

        String input = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";

        String actual = firstRepeated(input);
        String expected = "summer";

        assertEquals(expected, actual);
    }

    // Test for Empty String

    // Test for No Matches

    // Test for Uppercase/Lowercase

    // Test for Incorrect Data Type Input
}


