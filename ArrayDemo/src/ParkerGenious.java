import java.util.Scanner;

/*
 * Author: Archana Injineri
 * 
 * Logic:
 * 
 * No. of apples Gia has = (x + 2)
 * No. of apples Maddie has = x
 * 
 * Total Apples = No. of apples Gia has + No. of apples Maddie has
 * 
 * 10 = (x + 2) + x
 * 10 = 2 + 2x
 * (10 - 2)/ 2 = x
 * 
 * Therefore, x = (Total - More ) / 2
 * 
 * Gia has  = x + more  Apples
 * Maddie has = x  Apples
 * 
 */
public class ParkerGenious {

	public static void main(String[] args) throws Exception {
		
		int NumOfTestCases =2;
		int[] testCases;
		Scanner in = new Scanner(System.in);

		testCases = new int[NumOfTestCases];
		for(int i =0; i<NumOfTestCases ;i++ ) {
			testCases[i] = in.nextInt();
	    }
		for(int i = 0; i < NumOfTestCases; i+=2){
		computeCount(testCases[i], testCases[i+1]);
		}


	}

	public static void computeCount(int total, int more){
		int applecount = (total - more)/2;
		System.out.println(applecount + more);
		System.out.println(applecount);
	
	}
}
