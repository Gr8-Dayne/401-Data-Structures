package hashtable;




public class RepeatedWord {

    // Credit: https://www.geeksforgeeks.org/split-string-java-examples/
    public static String firstRepeated(String input) {

        HashMap tempHash = new HashMap();

        for (String wordToBeSaved : input.split("[ ,.?!]")) {

            wordToBeSaved = wordToBeSaved.toLowerCase();

            System.out.println("\nwordToBeSaved: " + wordToBeSaved);

            if (tempHash.contains(wordToBeSaved)) {
                return wordToBeSaved;
            }

            double randomVal = Math.floor(Math.random() * 40);
            Integer wordVal = Math.toIntExact(Math.round(randomVal));
            System.out.println("wordVal: " + wordVal);

            // Add word being iterated over if not previously stored
            tempHash.add(wordToBeSaved, wordVal);
        }
        return "No duplicate words detected.";
    }
}

    // Iterate through input

    // Save each word as it's own String (separate/split by spaces: "[, ?.@]+")
    // Save into [HashMap?]

    // If wordToBeSaved == alreadySavedWord from alreadySavedWords
    // Return this.wordToBeSaved

    // Else
    // Return: "No matching words from inputted String"

    // Else
    // Return: "ERROR incorrect data type for this method"


