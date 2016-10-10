/* Owen Dix
 * 03 April 2014
 * CSC 110 #20385
 * Ch7PP2Letters_OwenDix
 * Program Description:
 * IN ORDER OF METHOD CALL
 * readUpToFirstPeriod():
 *  * Prompt user for input and read up to first period. If no period, prompt again.
 * * Convert input text to lowercase for simplicity.
 * parseForLetterFrequency():
 *  * Parse input text: finding the frequency of letters
 * displayLettersAndFrequency():
 *  * Display all letters in the alphabet, each on a different line, 
 *    along with the number of times each letter occurs.
 * askToTryAgain():
 *  * Ask if user would like to try again
 * */
import java.util.Scanner;

public class Ch7PP2Letters_OwenDix
{
	// When Scanner is included in each method and closed, 
	// it does not wait for user input and the NoSuchElementException is thrown
	private static Scanner stdin = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int[] letters = new int[26];
		String inputText;
		boolean tryAgain=true;
		
		do{
			//Read line of text up to first period
			inputText=readUpToFirstPeriod();
			
			//convert the entire string to lowerCase
			inputText = inputText.toLowerCase();
			//System.out.println(inputText);
			
			//Parse text for letter frequency
			letters = parseForLetterFrequency(inputText);
		
			System.out.println("Outputting letter frequency up to first occurrence of '.' in input: ");
			//Display all letters that occur in text with letter frequency
			displayLettersAndFrequency(letters);
			
			//Ask to try again
			tryAgain = askToTryAgain();
			
		}while(tryAgain);
	
	}
	
	//Methods
	private static String readUpToFirstPeriod()
	{
		/* Precondition: nothing
		 * Postcondition: User is prompted and 
		 * a string containing up to (and excluding) the first period in the input
		 * is returned.
		 * */
		String inputText;
		int periodIndex;
		
		do{
			//Prompt for line of text
			System.out.println("Please input a line of text ending with a period, '.'.");
			//Read line of text, UNTIL it ends with a period.
			//If no period, ask to read again.
			inputText=stdin.nextLine();	//newline \n is read and discarded
			
			//Only use the substring up to first occurrence of period.
			periodIndex=inputText.indexOf(".");
			
			if (periodIndex != -1)	//There is a period in there
				inputText = inputText.substring(0,periodIndex); //substring excludes periodIndex
			
		}while(periodIndex == -1); //If there was no period (== -1) ask again
			
		return inputText;
	}
	
	private static int[] parseForLetterFrequency(String inputText)
	{
		/* Precondition: inputText String must be cast to lower case
		 * Postcondition: all occurrences of letters 'a' through 'z' will 
		 * be counted and returned in the letters array.
		 * */
		int[] letters = new int[26];
		int i, theInt;
		char theChar;
		
		//Initialize letters to zero
		for (i=0; i<letters.length; i++)
			letters[i]=0;
		
		//go through entire inputText
		for (i=0; i<inputText.length(); i++){
			//if the character is a letter, put it in the right array spot
			theChar = inputText.charAt(i);
			theInt = charToIntValue(theChar);
			if (theInt >= 0 && theInt < letters.length)
				letters[theInt]++;	//Count that particular letter
			
		}
		
		return letters;
	}
	
	private static int charToIntValue(char theChar)
	{
		/* Precondition: theChar must have been converted to lowercase before call. 
		 * Otherwise, the int value will be discarded after return.
		 * Postcondition: the int value will be between 0 and 25, inclusively, if it is a letter. */
		return (int)theChar - (int)'a';
	}
	
	private static void displayLettersAndFrequency(int[] letters)
	{		
		/* Precondition: parseForLetterFrequency must have been called.
		 * Postcondition: no values changed. Output to screen, the character corresponding 
		 * to the index values of letters and the number of occurrences corresponding 
		 * to the value stored in letters[index]
		 * */
		char theChar;
		
		for (int i=0; i< letters.length; i++){
			theChar = intToCharValue(i);
			System.out.println(theChar+": "+letters[i]);
		}
	}
	
	private static char intToCharValue(int theInt)
	{
		/* Precondition: theInt must be between 0 and 25 inclusively or 
		 * unwanted char values may occur.
		 * Postcondition: returns the char value for the given int. No 
		 * external/static variable changed.
		 * */
		return (char)(theInt+(int)'a'); 
	}
	
	private static boolean askToTryAgain()
	{
		/* Precondition: Called at end of main() do-while loop
		 * Postcondition: No instance variables changed. Returns boolean whether the 
		 * user wants to try the main() logic again.
		 * */
		String tryAgainText;

		while(true){
			System.out.println("Would you like to try again? Type: yes OR no");
			//System.in.wait();	//Wait for input
			tryAgainText=stdin.nextLine();
			tryAgainText.toLowerCase();
			if (tryAgainText.equals("yes")){
				return true;
			}else if (tryAgainText.equals("no")){
				return false;
			}
		}

	}
	
}