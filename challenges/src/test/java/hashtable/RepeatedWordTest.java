package hashtable;


import org.junit.Test;
import static hashtable.RepeatedWord.firstRepeated;
import static org.junit.Assert.*;


public class RepeatedWordTest {

    @Test
    public void firstRepeatedHappyTest() {
        String input = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        assertEquals("it", firstRepeated(input));
    }

    @Test
    public void firstRepeatedFailureTest() {
        String input = "Living % with * my best/friends #live!" + "kill";
        assertEquals("No matching words from inputted String", firstRepeated(input));
    }

    // Test for Uppercase/Lowercase
    @Test
    public void edgeCaseCapitalizationTest() {
        String input = "SOMETIMES I just wanna go for a drive; sometimes";
        String actual = firstRepeated(input);
        String expected = "sometimes";
        assertEquals(expected, actual);
    }

    // Test for Empty String
    @Test
    public void edgeCaseEmptyStringTest() {
        String input = "";
        assertEquals("No matching words from inputted String", firstRepeated(input));
    }

    // Test for No Matches
    @Test
    public void edgeCaseNoMatchesTest() {
        String input = "One hell of a day, wasn't it?";
        assertEquals("No matching words from inputted String", firstRepeated(input));
    }
}


