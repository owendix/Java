/* Owen Dix
 * 06 April 2014
 * CSC 110 #20385
 * DriverCh6PP3Person_OwenDix
 * Program Description:
 * For use with testing the class Ch6PP3Person_OwenDix
 * */
public class DriverCh6PP3Person_OwenDix
{

	public static void main(String[] args)
	{
		Ch6PP3Person_OwenDix nameConstrPerson = new Ch6PP3Person_OwenDix("Owen");
		Ch6PP3Person_OwenDix ageConstrPerson = new Ch6PP3Person_OwenDix(30);
		Ch6PP3Person_OwenDix bothConstrPerson = new Ch6PP3Person_OwenDix("Owen",30);
		Ch6PP3Person_OwenDix noneConstrPerson = new Ch6PP3Person_OwenDix();

		System.out.println("Construct with name: is name = Owen and age=30?:  "+nameConstrPerson.getName()
		+ " " + nameConstrPerson.getAge());
		System.out.println("Construct with age: is name = Human and age = 30?:  "+ageConstrPerson.getName()
		+ " " + ageConstrPerson.getAge());
		System.out.println("Construct with both: is name = Owen and age=30?:  "+bothConstrPerson.getName() 
		+ " " + bothConstrPerson.getAge());
		System.out.println("Default construct: is name = Human and age=30?:  "+noneConstrPerson.getName()
		+ " " + noneConstrPerson.getAge());
		
		ageConstrPerson.setName("Owen");
		nameConstrPerson.setAge(50);
		System.out.println("setName: from Human --> Owen. name=Owen?  "+ageConstrPerson.getName());
		System.out.println("setAge: from 30 --> 50. age=50?  "+nameConstrPerson.getAge());
		System.out.println("Is Owen same name as Owen? "+bothConstrPerson.hasSameNameAs(ageConstrPerson));
		nameConstrPerson.setName("Omar");
		System.out.println("Is Owen same name as Omar? "+bothConstrPerson.hasSameNameAs(nameConstrPerson));
		System.out.println("Is 30 yr old the same age as 30 yr old? "+bothConstrPerson.isSameAgeAs(ageConstrPerson));
		nameConstrPerson.setAge(29);
		System.out.println("Is 30 yr old the same age as 29 yr old? "+bothConstrPerson.isSameAgeAs(nameConstrPerson));
		noneConstrPerson.setName("Owen");
		noneConstrPerson.setAge(30);
		System.out.println("Is (Owen,30) same person as (Owen,30)?  "+bothConstrPerson.isSamePersonAs(noneConstrPerson));
		noneConstrPerson.setName("Omar");
		noneConstrPerson.setAge(29);
		System.out.println("Is (Owen,30) same person as (Omar,29)?  "+bothConstrPerson.isSamePersonAs(noneConstrPerson));
		System.out.println("Is (Owen,30) older than (Omar,29)?  "+bothConstrPerson.isOlderThan(noneConstrPerson));
		noneConstrPerson.setAge(30);
		System.out.println("Is (Owen,30) older than (Omar,30)?  "+bothConstrPerson.isOlderThan(noneConstrPerson));
		noneConstrPerson.setAge(31);
		System.out.println("Is (Owen,30) younger than (Omar,31)?  "+bothConstrPerson.isYoungerThan(noneConstrPerson));
		noneConstrPerson.setAge(30);
		System.out.println("Is (Owen,30) younger than (Omar,30)?  "+bothConstrPerson.isYoungerThan(noneConstrPerson));	
	}

}
