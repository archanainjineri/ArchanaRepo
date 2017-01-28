
/*
 * 
 * Author: Archana Injineri
 * Logic: 
 * 		Example I/p: list = {"test", "tester", "testertest","testing","testingtester"} ;
 * 		Sort the list in descending order by their length
 * 		Example o/p will be [testingtester, testertest, testing, tester, test]
 * 		For each value in the array - check whether other array values contains in the array value you have 
 *		taken. if it is exist replace with empty string "" and assign it to temporary variable.
 *		Continue for remaining array elements  till the string becomes empty.
 *		After keep on replacing with existing remaining array elements if temporary string is empty then result is found.
 *		If not their is no such value in the input.
 * 	
 */
import java.util.Arrays;
import java.util.Comparator;

public class LongestWord {

	//public static  String[] list = {"nnnnnmmmmmmmmmn", "HelloHiHello", "Hello","Hi","HelloHiHiHello"} ;
	public static  String[] list = {"test", "tester", "testertest","testing","testingtester"} ;
	
	
	public static void main(String[] args) {		
		
		//Sort the input array list in descending order using custom comparator
		 Arrays.sort(list, new LengthComparator());
		
		//Prints the sorted array
		System.out.println("Sorted Array in descending order is : "+ Arrays.toString(list));
		
		
		String result = getLongWord(list);
		
		//Disply resultant String.
		if(result.length() > 0){
		System.out.println(" Longest Word is : "  + result );		
		}		
		else{
			System.out.println(" No Result Found!!! ");
		}
		
		
	}
	
	//Gives the longest word made by other words, if not empty string is returned.
	public static String getLongWord(String[] inputList){
		String ans = "";
		for(int i = 0; i< inputList.length ; i++){
			if(checkLongest(inputList[i],i,inputList).length() == 0){
				ans= inputList[i];
				return ans;
			}
		}		
		return ans;
	}
	
	
   //Compare each String with resultant string to find longest word made by other words
	public static String checkLongest(String str, int k, String[] list){
		String temp = str;
		for(int i=k+1; i< list.length;i++){
			if(str.contains(list[i]) ){
				str = str.replace(list[i], "");
				temp = str;
			}
		}
		return temp;
	}

}

	//Customer Comparator to sort the array of String in descending order by their length.
	class LengthComparator implements Comparator<String> {
		  public int compare(String o1, String o2) {
			   if (o1.length() < o2.length()) {
				      return 1;
				    } else if (o1.length() > o2.length()) {
				      return -1;
				    } else {
				      return 0;
				    }
		  }
	}


 
