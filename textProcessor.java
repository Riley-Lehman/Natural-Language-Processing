import java.util.ArrayList; // Import the ArrayList class.

/**
 * Analyzes and processes text
 */
public class textProcessor { // Start of the textProcessor class.

  private String filename;              // The file containing the text.
  private ArrayList<String> textList;   // List to store text, with each line as an element.

  /**
   * Constructor to create a TextProcessor with the specified filename
   */
  public textProcessor(String filename) { // Constructor method.
    this.filename = filename; // Set the filename.
    textList = FileReader.toStringList(filename); // Load text from the file.
  }

  /**
   * Accessor Method for fileName
   * @return filename the name of the txt file
   */
  public String getFileName() { // Method to get the filename.
    return filename; // Return the filename.
  }

  /**
   * Accessor Method for textList
   * @return textList the ArrayList of lines read from the txt file
   */
  public ArrayList<String> getTextList() { // Method to get the textList.
    return textList; // Return the list of text lines.
  }

  /**
   * Changes the file to analyze and process and updates the textList
   * @param filename new filename to set
   */
  public void changeFile(String filename) { // Method to change the text file.
    this.filename = filename; // Set new filename.
    textList = FileReader.toStringList(filename); // Load new text file.
  }

  /**
   * Returns an ArrayList containing the individual words from textList
   * @return list of individual words
   */
  public ArrayList<String> textToWords() { // Method to extract words from textList.
    ArrayList<String> wordList = new ArrayList<>(); // List to store words.

    for (int index = 0; index < textList.size(); index++) { // Loop through each line.
      String currentLine = textList.get(index); // Get the current line.
      int location = currentLine.indexOf(" "); // Find the space in the line.

      while (location != -1) { // While there's a space:
        String currentWord = currentLine.substring(0, location); // Get the word.
        wordList.add(currentWord); // Add word to word list.
        currentLine = currentLine.substring(location + 1); // Update current line.
        location = currentLine.indexOf(" "); // Find next space.
      }

      wordList.add(currentLine); // Add any remaining text as the last word.
    }
    
    return wordList; // Return the list of words.
  }

  /**
   * toString Method Override
   * @return string representation of the textList
   */
  public String toString() { // Method to convert textList to string.
    String text = ""; // Initialize empty string.

    for (String value : textList) { // Loop through each line in textList.
      text += value + "\n"; // Add line to the string with a newline.
    }

    return text; // Return the complete string representation.
  }
  
} // End of the textProcessor class.