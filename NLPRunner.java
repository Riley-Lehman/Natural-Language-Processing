import java.util.ArrayList; // Import the ArrayList class.

public class NLPRunner { // Start of the NLPRunner class.
  
  public static void main(String[] args) { // Main method of the program.

    ArrayList<String> keyWords = new ArrayList<>(); // List for keywords.
    ArrayList<String> wordDefinitions = new ArrayList<>(); // List for word definitions.

    myNLP nlp = new myNLP(); // Create an instance of myNLP.

    nlp.prompt(); // Call the prompt method.

    nlp.printSummary(); // Call the printSummary method.
    
  } // End of the main method.
} // End of the NLPRunner class.