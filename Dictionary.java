/**
 * @author shand
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Dictionary 
{
	/**
	 * 
	 * @param fileName
	 * @return
	 */
    // Load dictionary from CSV file into HashMap
    public static HashMap<String, String> loadDictionaryFromCSV(String fileName) 
    {
        HashMap<String, String> dictionary = new HashMap<>();

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileName)))) 
        {
            while (scanner.hasNextLine()) 
            {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length == 2) 
                {
                    String word = parts[0].trim();
                    String definition = parts[1].trim();
                    dictionary.put(word, definition);
                }
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

        return dictionary;
    }
    /**
     * 
     * @param dictionary
     */
    // Print keys and definitions of the dictionary
    public static void printDictionary(HashMap<String, String> dictionary) 
    {
        for (String word : dictionary.keySet()) 
        {
            System.out.println(word + ": " + dictionary.get(word));
        }
        System.out.println();
    }
    /**
     * 
     * @param dictionary
     * @param word
     */
    // Search for a word in the dictionary, print details
    public static void searchAndPrint(HashMap<String, String> dictionary, String word) 
    {
        String definition = dictionary.get(word);
        int hashKey = word.hashCode();

        System.out.println("Search Result for '" + word + "':");
        if (definition != null) 
        {
            System.out.println("Definition: " + definition);
            System.out.println("Hash Key: " + hashKey);
        } else 
        {
            System.out.println("Word not found in the dictionary.");
        }
        System.out.println();
    }
}
