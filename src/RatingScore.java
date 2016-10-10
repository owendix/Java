/* Owen Dix
 * 30 March 2014
 * CSC 110 #20385
 * RatingScore
 * Do not need to submit as HW directly (I think).
 * Program description: For use with Ch5and6Design programs
 */
public class RatingScore 
{
	//Instance variables
	private String ratingDescrip;
	private double maxRating, rating;

	//Constructors
	public RatingScore(String theRatingDescrip, double theMaxRating, 
			double aRating)
	{
		ratingDescrip=theRatingDescrip;
		if (theMaxRating<0.0){
			theMaxRating=0.0;
		}
		maxRating=theMaxRating;
		if (aRating>maxRating){
			aRating = maxRating;
		}else if (aRating<0.0){
			aRating = 0.0;
		}
		rating=aRating;
	}
	public RatingScore(String theRatingDescrip, double theMaxRating)
	{
		this(theRatingDescrip, theMaxRating,0.0);	
	}
	public RatingScore(double theMaxRating)
	{
		this("",theMaxRating,0.0);
	}
	public RatingScore()
	{
		this("",0.0,0.0);
	}
	//Mutator methods
	/* Precondition: only that the object is constructed.
	Postcondition: rating will be set to the input value (a double).
	*/
	public void setRating(double aRating)
	{
		if (aRating>maxRating){
			aRating = maxRating;
		}else if (aRating<0.0){
			aRating = 0.0;
		}
		rating = aRating;
	}
	//Accessor methods
	/* Precondition: object constructed only
	 * Postcondition: nothing changed
	 * */
	public String getRatingDescrip()
	{
		return ratingDescrip;
	}
	/* Precondition: maxRating initialized (done during object construction)
	Postcondition: maxRating is returned, unaltered by method call. 
	*/
	public double getMaxRating()
	{
		return maxRating;
	}
	/* Precondition: rating must be initialized, either during object construction or with prior 
	call to setRating(). 
	Postcondition: rating is returned, unaltered by method call. 
	*/
	public double getRating()
	{
		return rating;
	}
	/* Precondition: rating must be initialized, either during object construction or with prior 
	call to setRating().
	Postcondition: a String format of rating is returned; rating is unaltered by method call. 
	*/
	public String getDisplayRating()
	{
		return String.valueOf(rating);
	}
}
