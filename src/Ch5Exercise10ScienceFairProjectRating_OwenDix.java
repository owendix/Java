/* Owen Dix
 * 30 March 2014
 * CSC 110 #20385
 * Ch5Exercise10ScienceFairProjectRating_OwenDix
 * Program description: For use with Ch5and6Design programs
 * Creates a class for storing a science fair project's rating. Includes
 * information on the project's name (projectName), person's name (personName), 
 * number of judges (nJudges), a uniqueID (which concatenates personName+projectName+idCounter), 
 * idCounter is a static number for each instance of this class which ensures that uniqueID is 
 * unique. 
 * The different ratings are for creativity (max 30), scienceThought (max 30), 
 * thoroughness (max 15), technical skill (max 15), and clarity (max 10): totaling 100 points. 
 * the rating scores are stored as RatingScore class types, which relies on this class be used 
 * in the same directory. These max values are hard coded into the constructors for each 
 * category of score.
 */
public class Ch5Exercise10ScienceFairProjectRating_OwenDix
{
	//Instance variables
	private static int idCounter=0;
	private int nJudges;
	private String projectName, uniqueID, personName;
	/* According to the textbook, pg 435, using class type instance 
	 * variables can lead to privacy leaks. To avoid this, all of my 
	 * accessor methods only return individual attributes of 
	 * the RatingScore objects, except for 
	 * getTotalDisplayRating() which returns a String. Strings are 
	 * classes that do not have mutator methods, so this is also okay.
	 * */
	private RatingScore creativity = new RatingScore("creativity",30);
	private RatingScore scienceThought = new RatingScore("scientific thought",30);
	private RatingScore thoroughness = new RatingScore("thoroughness",15);
	private RatingScore technical = new RatingScore("technical skill",15);
	private RatingScore clarity = new RatingScore("clarity",10);
	
	//Constructors
	public Ch5Exercise10ScienceFairProjectRating_OwenDix(String aProjectName,
			String aPersonName, int theNJudges, double aCreativityVal, 
			double aScienceThoughtVal, double aThoroughnessVal,
			double aTechnicalVal, double aClarityVal)
	{
		projectName=aProjectName;
		personName=aPersonName;
		setUniqueID();
		nJudges=theNJudges;
		creativity.setRating(aCreativityVal);
		scienceThought.setRating(aScienceThoughtVal);
		thoroughness.setRating(aThoroughnessVal);
		technical.setRating(aTechnicalVal);
		clarity.setRating(aClarityVal);
	}
	public Ch5Exercise10ScienceFairProjectRating_OwenDix(String aProjectName, 
			String aPersonName)
	{
		this(aProjectName,aPersonName,0,0.0,0.0,0.0,0.0,0.0);	
	}
	//Default constructor
	public Ch5Exercise10ScienceFairProjectRating_OwenDix()
	{
		this("project","StudentName",0,0.0,0.0,0.0,0.0,0.0);	
	}
		
	//Mutator Methods: constructors CAN call methods (make them private if poss.)
	private void setUniqueID()
	{/* Precondition: object is constructed only
		 * Postcondition: uniqueID string is set, unique counter idCounter, is incremented
		 * */
		uniqueID=personName+projectName+String.valueOf(idCounter);
		idCounter++;	//Make sure unique ID is unique
	}
	//Accessor Methods
	public int getNJudges()
	{/* Precondition: object is constructed only, default nJudges set to 0
		 * Postcondition: nothing is changed
		 * */
		return nJudges;
	}
	public String getUniqueID()
	{/* Precondition: object is constructed only
		 * Postcondition: nothing is changed
		 * */
		return uniqueID;
	}
	public double getCreativity()
	{/* Precondition: object is constructed only, default set to 0.0
		 * Postcondition: nothing is changed
		 * */
		return creativity.getRating();
	}
	
	public double getScienceThought()
	{/* Precondition: object is constructed only, default set to 0.0
		 * Postcondition: nothing is changed
		 * */
		return scienceThought.getRating();
	}
	
	public double getThoroughness()
	{/* Precondition: object is constructed only, default set to 0.0
		 * Postcondition: nothing is changed
		 * */
		return thoroughness.getRating();
	}
	public double getTechnical()
	{/* Precondition: object is constructed only, default set to 0.0
		 * Postcondition: nothing is changed
		 * */
		return technical.getRating();
	}
	public double getClarity()
	{/* Precondition: object is constructed only, default set to 0.0
		 * Postcondition: nothing is changed
		 * */
		return clarity.getRating();
	}
	public double getTotalRating()
	{/* Precondition: object is constructed only, default set to 0.0
		 * Postcondition: nothing is changed
		 * */
		return getCreativity() + getScienceThought() + getThoroughness()
				+ getTechnical() + getClarity();
	}
	public double getMaxTotalRating()
	{/* Precondition: object is constructed only, always set to 100 with this implementation
		 * Postcondition: nothing is changed
		 * */
		return creativity.getMaxRating()+scienceThought.getMaxRating()
				+thoroughness.getMaxRating()+technical.getMaxRating()
				+clarity.getMaxRating();
	}
	public String getTotalDisplayRating()
	{/* Precondition: object is constructed only, always set to "100" with this implementation
		 * Postcondition: nothing is changed
		 * */
		return String.valueOf(getTotalRating());
	}
}
