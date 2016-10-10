import java.util.Scanner;
/* Owen Dix
 * 02 March 2014
 * CSC110 # 20385
 * Ch3PP11BMRCalc_OwenDix
 * Program Description: Outputs the number of 230 Calorie chocolate
 * bars one should eat to maintain their weight, using the 
 * Harris-Benedict equation, their weight, height, age, gender, and 
 * activity level.
 */
public class Ch3PP11BMRCalc_OwenDix
{
	public static void main(String[] args)
	{
		//Declare user data entry variables
		Scanner stdin = new Scanner(System.in);
		double weightLbs, heightInches, ageYrs;
		String gender, activityLvl;
		
		//Some string responses contain a space, the default
		//whitespace delimiter will parse this improperly
		stdin.useDelimiter("\n");
		//Prompt user for input
		System.out.println("Input your weight in pounds: ");
		weightLbs=stdin.nextDouble();
		System.out.println("Input your height in inches: ");
		heightInches=stdin.nextDouble();
		System.out.println("Input your age in years: ");
		ageYrs=stdin.nextDouble();
		System.out.println("Input your gender: M for man, W for woman");
		gender=stdin.next();
		System.out.println("Reply with the quoted text that best matches your activity level:");
		System.out.println("\"Sedentary\"");
		System.out.println("\"Somewhat active\" (exercise occasionally)");
		System.out.println("\"Active\" (exercise 3-4 days per week)");
		System.out.println("\"Highly active\" (exercise every day)");
		System.out.println("Do not include quotations in input.");
		activityLvl=stdin.next();
		
		//Quick user-input error check
		if (weightLbs<=0 || heightInches<=0 || ageYrs<=0){
			System.out.println("Invalid numerical input");
			return;
		}else if (!gender.equals("M") && !gender.equals("W")){
			System.out.println("Please select either M or W");
			return;
		}else if (!activityLvl.equals("Sedentary") && !activityLvl.equals("Somewhat active")){
			if (!activityLvl.equals("Active") && !activityLvl.equals("Highly active")){
				System.out.println("Invalid activity level");
				return;
			}
		}
		
		//Declare subsequent variables
		double BMR, nChocBars;
		
		//Calculate BMR
		if (gender.equals("W")){
			BMR = 655 + 4.3*weightLbs + 4.7*(heightInches - ageYrs);
		}else{
			BMR = 66 + 6.3*weightLbs + 12.9*heightInches - 6.8*ageYrs;
		}
		//Adjust the BMR due to the activity level
		switch (activityLvl){
			case "Sedentary": 
				BMR*=1.2;
				break;
			case "Somewhat active": 
				BMR*=1.3;
				break;
			case "Active": 
				BMR*=1.4;
				break;
			default: 
				BMR*=1.5;
		}
		//How many chocolate bars must someone eat to maintain weight
		nChocBars=BMR/230.;
		//Tell the user the chocolate bar equivalent of their BMR
		System.out.printf("Eat %.2f chocolate bars to maintain your weight.\n", nChocBars);
	}
}
