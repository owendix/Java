/* Owen Dix
 * 06 April 2014
 * CSC 110 #20385
 * DriverCh5Exercise10ScienceFairProjectRating_OwenDix
 * Project Description:
 * This is for use in testing Ch5Exercise10ScienceFairProjectRating_OwenDix, 
 * which itself requires the class RatingScore.
 * */
public class DriverCh5Exercise10ScienceFairProjectRating_OwenDix 
{
	public static void main(String[] args)
	{
		Ch5Exercise10ScienceFairProjectRating_OwenDix testAllParams 
		= new Ch5Exercise10ScienceFairProjectRating_OwenDix("Volcano","JohnDoe",3,
				15,15,10,10,5);
		System.out.println("test setUniqueID via constructor: "+testAllParams.getUniqueID());
		System.out.println("test getNJudges: "+testAllParams.getNJudges());
		Ch5Exercise10ScienceFairProjectRating_OwenDix testAllParams2 
		= new Ch5Exercise10ScienceFairProjectRating_OwenDix("AnotherVolcano","JaneDoe",3,
				50,50,50,50,50);
		System.out.println("test getUniqueID for increment: "+testAllParams2.getUniqueID());
		
		Ch5Exercise10ScienceFairProjectRating_OwenDix testAllParams3 
		= new Ch5Exercise10ScienceFairProjectRating_OwenDix("SpaceShip","JaneneDole",3,
				-1,-1,-1,-1,-1);
		System.out.println("test getUniqueID for increment: "+testAllParams3.getUniqueID());
	
		
		System.out.println("test getCreativity = 15?: "+testAllParams.getCreativity());
		System.out.println("test getScienceThought = 15?: "+testAllParams.getScienceThought());
		System.out.println("test getThoroughness = 10?: "+testAllParams.getThoroughness());
		System.out.println("test getTechnical = 10?: "+testAllParams.getTechnical());
		System.out.println("test getClarity = 5?: "+testAllParams.getClarity());
		System.out.println("test getTotalRating = 55?: "+testAllParams.getTotalRating());
		System.out.println("test getMaxTotalRating = 100?: "+testAllParams.getMaxTotalRating());
		System.out.println("test getTotalDisplayRating = 55?: "+testAllParams.getTotalDisplayRating());

		System.out.println("test getCreativity = 30?: "+testAllParams2.getCreativity());
		System.out.println("test getScienceThought = 30?: "+testAllParams2.getScienceThought());
		System.out.println("test getThoroughness = 15?: "+testAllParams2.getThoroughness());
		System.out.println("test getTechnical = 15?: "+testAllParams2.getTechnical());
		System.out.println("test getClarity = 10?: "+testAllParams2.getClarity());
		System.out.println("test getTotalRating = 100?: "+testAllParams2.getTotalRating());
		System.out.println("test getMaxTotalRating = 100?: "+testAllParams2.getMaxTotalRating());
		System.out.println("test getTotalDisplayRating = 100?: "+testAllParams2.getTotalDisplayRating());

		System.out.println("test getCreativity = 0?: "+testAllParams3.getCreativity());
		System.out.println("test getScienceThought = 0?: "+testAllParams3.getScienceThought());
		System.out.println("test getThoroughness = 0?: "+testAllParams3.getThoroughness());
		System.out.println("test getTechnical = 0?: "+testAllParams3.getTechnical());
		System.out.println("test getClarity = 0?: "+testAllParams3.getClarity());
		System.out.println("test getTotalRating = 0?: "+testAllParams3.getTotalRating());
		System.out.println("test getMaxTotalRating = 100?: "+testAllParams3.getMaxTotalRating());
		System.out.println("test getTotalDisplayRating = 0?: "+testAllParams3.getTotalDisplayRating());

		
	}

}

