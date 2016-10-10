/* Owen Dix
 * 30 March 2014
 * CSC 110 #20385
 * Ch6PP3Person_OwenDix
 * Program description: For use with Ch5and6Design programs
 * This class models a person by storing their name and age. 
 * It has methods to check if two objects of this type 
 * have the same name (hasSameNameAs()), is the same age 
 * (isSameAgeAs()), is the same person (isSamePersonAs(): which merely 
 * checks both that they have the same name and age). 
 * It has methods to check if one object is older than another 
 * (isOlderThan()) and if one object is younger than another
 * (isYoungerThan()).
 */
public class Ch6PP3Person_OwenDix
{
	//Instance variables
	private String name;
	private int age;
	
	//Constructors
	public Ch6PP3Person_OwenDix(String theName, int theAge)
	{
		setName(theName);
		setAge(theAge);
	}
	public Ch6PP3Person_OwenDix(String theName)
	{
		setName(theName);
		setAge(30);
	}
	public Ch6PP3Person_OwenDix(int theAge)
	{
		setName("Human");
		setAge(theAge);
	}
	public Ch6PP3Person_OwenDix()
	{
		setName("Human");
		setAge(30);
	}
	
	//Mutator methods
	/* Precondition: object constructed only
	 * Postcondition: instance variable name is changed to theName
	 * */
	public void setName(String theName)
	{
		name = theName;
	}
	/* Precondition: object constructed only
	 * Postcondition: instance variable age is changed to theAge
	 * */
	public void setAge(int theAge)
	{
		age = theAge;
	}
	//Accessor methods
	/* Precondition: object constructed only
	 * Postcondition: nothing changed
	 * */
	public String getName()
	{
		return name;		
	}
	/* Precondition: object constructed only
	 * Postcondition: nothing changed
	 * */
	public int getAge()
	{
		return age;
	}
	/* Precondition: object constructed only
	 * Postcondition: nothing changed
	 * */
	public boolean hasSameNameAs(Ch6PP3Person_OwenDix aPerson)
	{
		return name.equals(aPerson.getName());
	}
	/* Precondition: object constructed only
	 * Postcondition: nothing changed
	 * */
	public boolean isSameAgeAs(Ch6PP3Person_OwenDix aPerson)
	{
		return age==aPerson.getAge();
	}
	/* Precondition: object constructed only
	 * Postcondition: nothing changed
	 * */
	public boolean isSamePersonAs(Ch6PP3Person_OwenDix aPerson)
	{
		// first test if same name, then test if same age
		return (this.hasSameNameAs(aPerson) && this.isSameAgeAs(aPerson));
	}
	/* Precondition: object constructed only
	 * Postcondition: nothing changed
	 * */
	public boolean isOlderThan(Ch6PP3Person_OwenDix aPerson)
	{
		//strictly older than
		return age > aPerson.getAge();
	}
	/* Precondition: object constructed only
	 * Postcondition: nothing changed
	 * */
	public boolean isYoungerThan(Ch6PP3Person_OwenDix aPerson)
	{
		//strictly younger than
		return age < aPerson.getAge();
	}
	
	//Driver: test program goes here
	public static void main(String args[])
	{
		
	}
}
