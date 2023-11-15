/**
 * @author shand
 */
import java.util.HashMap;

public class Application 
{

	 public static void main(String[] args) 
	 {
	        Dictionary myDict = new Dictionary();
		 
		 // Step 1: Load unsorted key/definition pairs into HashMap
	        HashMap<String, String> dictionary = myDict.loadDictionaryFromCSV("C:\\Users\\shand\\eclipse-workspace\\Assignment 5.1_HashMap_SPH\\src\\DictionaryWordValuePairs.csv");

	        // Step 2: Print unsorted dictionary keys and definitions
	        System.out.println("Unsorted Dictionary:");
	        myDict.printDictionary(dictionary);

	        // Step 3: Search for 5 words using HashMap get() and print details
	        myDict.searchAndPrint(dictionary, "asunder");
	        myDict.searchAndPrint(dictionary, "betimes");
	        myDict.searchAndPrint(dictionary, "nigh");
	        myDict.searchAndPrint(dictionary, "plight");
	        myDict.searchAndPrint(dictionary, "meat");
	 }
}
