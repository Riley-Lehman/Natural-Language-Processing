import java.util.ArrayList; // Import the ArrayList class.
import java.util.Scanner; // Import the Scanner class for user input.

public class myNLP { // Start of the myNLP class.

    private ArrayList<String> keyWords; // List to store keywords.
    private ArrayList<String> wordDefinitions; // List to store word definitions. 
  
    // Constructor for myNLP class.
    public myNLP() {
        keyWords = FileReader.toStringList("words.txt"); // Load keywords from a file.
        wordDefinitions = FileReader.toStringList("definitions.txt"); // Load definitions from a file.
    }

    // Method to check if a word is in the dictionary.
    public boolean findInDictionary(String word) {
        return keyWords.contains(word); // Check if the list contains the word.
    }

    // Method to prompt the user for a word and show its definition.
    public void prompt() {
        Scanner input = new Scanner(System.in); // Create a Scanner for user input.

        System.out.println("Input a word to find its definition!"); // Prompt message.
        String userInput = input.nextLine(); // Read user input.

        // Retrieve the index of the word in the keywords list
        int index = keyWords.indexOf(userInput);
        if (index != -1) { // If the word is found
            String definition = wordDefinitions.get(index); // Get the definition.
            System.out.println("Definition: " + definition); // Display the definition.
        } else { // If the word is not found
            System.out.println("I couldn't find that word!"); // Show not found message.
        }
        input.close(); // Close the Scanner.
    }

    // Method to print a summary (currently empty).
    public void printSummary() {
      
    }
} // End of the myNLP class.