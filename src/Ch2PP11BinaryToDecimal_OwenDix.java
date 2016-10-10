import java.util.Scanner;
/* Author: Owen Dix
 * Date: 28 January 2014
 * Course and Section#: CSC110 # 20385
 * Program Name: FourBits2Decimal_OwenDix
 * Program Description: Read 4-bit binary number from stdin (keyboard) 
 * as a string, split this to 4 single-digit substrings, convert 
 * this to decimal, output decimal version to screen.
 * Note: we have not learned the conditionals necessary to test 
 * for incorrect input values (e.g. 11011 or 1012).
 */
public class Ch2PP11BinaryToDecimal_OwenDix
{
	public static void main(String[] args)
	{
		//Declare new input from keyboard
		Scanner stdin = new Scanner(System.in);

		//Prompt for and read 4-bit binary number as string
		System.out.println("Input a 4-bit binary number: ");
		String fourBits=stdin.next();

		//The Ascii (Unicode) integer value for the char '0'
		final int zeroAscii=(int)'0';

		//Parse into characters and convert to integer
		int b0=(int)fourBits.charAt(0) - zeroAscii;
		int b1=(int)fourBits.charAt(1) - zeroAscii;
		int b2=(int)fourBits.charAt(2) - zeroAscii;
		int b3=(int)fourBits.charAt(3) - zeroAscii;

		//Convert bits into decimal number
		int decimal = 8*b0+4*b1+2*b2+b3;
	
		//Output decimal to screen
		System.out.println("Your number in base-10 is: "+decimal);

	}
}
