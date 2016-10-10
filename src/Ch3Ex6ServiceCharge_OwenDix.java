import java.util.Scanner;

/* Owen Dix
 * 02 March 2014
 * CSC110 # 20385
 * Ch3Ex6ServiceCharge_OwenDix
 * Program Description: Output the service charge for cashing a 
 * check using a multi-branch if-statement.
 */
public class Ch3Ex6ServiceCharge_OwenDix
{
	public static void main(String[] args)
	{
		//Set variable for reading user input
		Scanner stdin = new Scanner(System.in);
		double checkAmount, serviceCharge;
		
		//Read in checkAmount
		System.out.println("What is the amount on the check?");
		checkAmount = stdin.nextDouble();
		
		//Calculate the service Charge
		if (checkAmount < 10){
			serviceCharge = 1;
		}else if (checkAmount<100){
			serviceCharge = 0.1*checkAmount;
		}else if (checkAmount<1000){
			serviceCharge = 5 + 0.05*checkAmount;
		}else{
			serviceCharge = 40 + 0.01*checkAmount;
		}
		
		//Output serviceCharge
		System.out.printf("The service charge is $%.2f\n",serviceCharge);
	}
}