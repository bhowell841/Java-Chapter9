import java.util.Scanner;

/*
 * Brendan Howell
 * CSC-151
 * Project that accepts a word from user input
 * then returns that word backwards.
 * 
 */
public class BackwardString {

	public static void main(String[] args) {
		// instance of scanner
		Scanner input = new Scanner(System.in);
		
		// get the word
		System.out.println("Enter a word: ");
		String word = input.nextLine();
		
		//  use a for loop to print word backwards
		for(int index=word.length()-1; index >=0; index--){
			System.out.print(word.charAt(index));
		} // end for loop

	}  // End Main

}  //  End Class
