package hashtable;


public class RepeatedWord {

    // Credit: https://www.geeksforgeeks.org/split-string-java-examples/
    public static String firstRepeated(String input) {

        HashMap tempHash = new HashMap();

        // Iterate through input
        for (String wordToBeSaved : input.split("[ ,.?!;:']")) {

            // Create Integer for hashing
            double randomVal = Math.abs(Math.floor(Math.random() * 40));
            Integer wordVal = Math.toIntExact(Math.round(randomVal));

            // Lowercase everything
            wordToBeSaved = wordToBeSaved.toLowerCase();

            // If wordToBeSaved == alreadySavedWord from alreadySavedWords
            if (tempHash.contains(wordToBeSaved)) {
                // Return this.wordToBeSaved
                return wordToBeSaved;
            }
            // Save each word as it's own String if it hasn't been saved yet
            tempHash.add(wordToBeSaved, wordVal);
        }
        return "No matching words from inputted String";
    }
}


