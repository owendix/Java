
public class FinalExamTest1 {

	public static void main(String[] args) {
		int[] list = {0,1,2,3,4,5,6,7,8,9,-1,-2,-4,-4,-5,-6,-7,-8,-9,-10};
		int nOdd = 0, i;
		
		for (i=0; i<list.length; i++){
			if (list[i] % 2 != 0)
				nOdd++;
		}
		System.out.println("The list of 20 values has "+nOdd+" number of odd integers!");
	}

}
