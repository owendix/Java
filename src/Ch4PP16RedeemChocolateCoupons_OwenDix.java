import java.util.Scanner;
/* Owen Dix
 * 02 March 2014
 * CSC110 # 20385
 * Ch4PP16RedeemChocolateCoupons_OwenDix
 * Program Description: Chocolate bars cost $1, and each contains a 
 * coupon. Six coupons can be used to redeem another chocolate bar.
 * How many chocolate bars can you buy, for a user-input amount of 
 * money, and how many coupons will remain (all possible coupons must
 * be redeemed for chocolate bars)?
 */
public class Ch4PP16RedeemChocolateCoupons_OwenDix
{
	public static void main(String[] args)
	{
		//set given data
		int costChocBar=1, nRedeem=6;
		//set user input variables
		Scanner stdin = new Scanner(System.in);
		int nDollars;
		
		//Read in user's amount of money for buying chocolate bars
		System.out.println("How many dollars do you have?");
		nDollars = stdin.nextInt();
		
		//Quick user-error input check
		if (nDollars<0){
			nDollars=0;
		}
		
		//Set initial loop variables
		int nChocBars = nDollars/costChocBar;
		int nCoupons = nChocBars;
		
		//Trade coupons from your money-purchased chocolate 
		//bars for more chocolate bars
		while (nCoupons >= nRedeem){
			nCoupons -= (nRedeem-1);
			nChocBars++;
		}
		//Tell the user how many chocolate bars and coupons will result
		System.out.print("You can purchase "+nChocBars+" chocolate bars");
		System.out.print(" and will have "+nCoupons+" coupons remaining.\n");
	}
}