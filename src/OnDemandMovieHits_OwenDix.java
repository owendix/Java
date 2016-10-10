/* Owen Dix
 * 01 April 2014
 * CSC 110 #20385
 * OnDemandMovieHits_OwenDix
 * Program Description:
 * Given: a set list (array) of movies available and a corresponding
 * list of prices per day for each specific movie.
 * 1) printMovies: Output list of movies to screen
 * 2) readMovieChoice: Read user's choice of movie
 * 	  a) read user's choice of movie
 *    b) check that it is a valid choice
 *    c) if so: print price for that movie: use printTotalPrice with 1 day
 * 3) howManyDays: Ask how many days they want to rent their movie
 *    a) read number of days desired to rent movie
 *    b) check it is a valid choice: not negative, not more than 10 years (will we be in business?)
 * 4) printTotalPrice: Calculate and print total price; store total price but discard, in case 
 * we wish to modify later.
 * */
import java.util.Scanner;

public class OnDemandMovieHits_OwenDix
{
	//movieList and priceList are in the same order
	private static final String[] movieList = {"","Jumanji", "Heat", 
			"The Princess Bride", "Garden State", 
			"The Hobbit: Part 1", "The Hunger Games", 
			"The Wizard"};
	//priceList is the per day price
	private static final double[] priceList = {0.00, 1.10, 1.20, 1.50, 1.25, 2.00, 2.00, 
			1.00};
	/* The zeroth entry in movieList and priceList is skipped (filler values included)
	 * All choices of movie/price range from MOVIE_FIRST to MOVIE_LAST (inclusively) which 
	 * cannot be changed.*/
	private static final int MOVIE_FIRST=1, MOVIE_LAST=(movieList.length-1);
	
	private static int nDays, movieChoice;
	private static double totalPrice;
	//Need to use same stdin in all methods or else exception thrown with nextInt()
	//There may be another way around this but it worked.
	private static Scanner stdin = new Scanner(System.in);
	
	public static void main(String[] args)
	{	
		//Output a greeting
		System.out.println("Thank you for choosing On Demand.");
		//Print list of movies
		printMovies();
		//Read user's choice of movies, outputting price once selected
		movieChoice = readMovieChoice();
		//Read user's choice of how many days to rent
		nDays=howManyDays();
		//Calculate and print total price
		totalPrice = printTotalPrice(movieChoice,nDays);
	}
	
	//Methods
	public static void printMovies()
	{
		/* Precondition: movieList and priceList are populated arrays an din the same order
		 * Postcondition: no instance variables set, movies displayed to screen for user.
		 *  Note: movies are labeled with numbers starting from MOVIE_FIRST to
		 *  MOVIE_LAST (inclusively).
		 * */
		System.out.println("We have the following movies available: ");
		for (int i=MOVIE_FIRST; i<=MOVIE_LAST; i++){
			System.out.println(i+") "+movieList[i]);
		}
	}
	public static int readMovieChoice()
	{
		//Needed to make static to avoid warning with use in main
		/* Precondition: Immediately preceded by call to printMovies(). Both movieList and 
		 * priceList must be populated arrays and in the same, corresponding order.
		 *   Note: movies are labeled with numbers starting from MOVIE_FIRST to
		 *   MOVIE_LAST (inclusively). 
		 * Postcondition: aMovieChoice is returned to be set equal to movieChoice.
		 * movieChoice is guaranteed to be reset back to the values 0->(movieList.length-1)
		 * so movieChoice can be used directly
		 * */
		int aMovieChoice;
		boolean validChoice=false;
		do{
			System.out.println("Input the number of your choice to view the price per day: ");
			aMovieChoice = stdin.nextInt();
			if (aMovieChoice >=MOVIE_FIRST && aMovieChoice<=MOVIE_LAST){
				printTotalPrice(aMovieChoice,1);	//Print cost for 1 day, formats $x.xx
				validChoice=true;
			}else{
				System.out.println("Your choice must be between "+MOVIE_FIRST+" and "+MOVIE_LAST
						+", inclusively.");
				validChoice=false;
			}
		}while(!validChoice);
		
		return aMovieChoice;
	}
	public static int howManyDays()
	{
		/* Precondition: nothing
		 * Postcondition: number of days to rent is returned for setting equal to nDays
		 * */
		boolean validChoice=true;
		int aNDays, upperLimitNDays=3660;
		do{
			System.out.println("For how many days would you like your movie? ");
			aNDays=stdin.nextInt();
			if (aNDays<0){
				System.out.println("You cannot rent for less than 0 days.");
				validChoice=false;
			}else if(aNDays>=upperLimitNDays){
				System.out.println("You cannot rent for more than 10 years.");
				validChoice=false;
			}else{
				validChoice=true;
			}
		}while(!validChoice);
		
		return aNDays;
	}
	public static double printTotalPrice(int theMovieChoice, int theNDays)
	{
		/* Precondition: must set theMovieChoice and theNDays parameters, either manually 
		 * or by calling readMovieChoice() and howManyDays(). 
		 * Also, movieList and priceList are populated arrays 
		 * in the same order.
		 * Postcondition: calculates and prints the total price for renting 
		 * theMovieChoice for theNDays ($X.XX format) 
		 * and returns to be set to totalPrice (to save if desired).
		 * */
		double thePrice;
		thePrice=priceList[theMovieChoice]*theNDays;
		System.out.print("The price of renting "+movieList[theMovieChoice]+
				" for "+theNDays+" day(s) is: ");
		System.out.printf("$%.2f\n", thePrice);
		return thePrice;
	}
}
