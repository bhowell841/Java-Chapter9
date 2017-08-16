import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Brendan Howell
 * CSC-151
 * String Operations project
 * This project accepts a reference to a String object as an argument
 * and returns a word count and replaces a selected word with a new 
 * word.   
 * 
 */
public class StringOperations {

	public static void main(String[] args) {
		// declare String
		String str1;
		String str2;
		String str3;

		// instance of scanner
		Scanner input = new Scanner(System.in);

		//Get the string
		System.out.println("Enter a sentence: ");
		str1 = input.nextLine();

		//Get word to replace
		System.out.println("What word would you like to replace: ");
		str2 = input.nextLine();

		//Get replacement word
		System.out.println("What would you like the replacement word to be: ");
		str3 = input.nextLine();

		int count = wordCount(str1);
		System.out.println("The number of words in the sentence: "
				+ StringOperations.wordCount(str1));

		String replace = replaceSubstring(str1, str2, str3);
		System.out.println(StringOperations.replaceSubstring(str1, str2, str3));

	}  //  End Main
	
	// Create a method to count the number of words in the sentence
	public static int wordCount(String sentence) {
		StringTokenizer count = new StringTokenizer(sentence);
		return count.countTokens();
	} // end method
	
	// Create a method to replace a substring in a string
	private static String replaceSubstring(String str1, String str2, String str3) {
		String newSentence = str1.replace(str2, str3);
		return newSentence;
	} // end method



}  //  End Class


