import java.util.Arrays;
import java.util.Comparator;


class comp implements Comparator<String> {
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

public class CopyOfLongestWord {

	public static  String[] list = {"HelloHi", "Hi", "Hello"} ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Sort the input array list in descending order using custom comparator
		 Arrays.sort(args, new comp());
		
		//Prints the sorted array
		System.out.println("Sorted Array in descending order is : "+ Arrays.toString(list));
		
		System.out.println(" Longest Word is : "  + getLongWord(args));
		
	}
	
	public static String getLongWord(String[] inputList){
		
		/*for(String word: inputList){
			getLongest(word);
		}*/
		
		return getLongest("HelloHi");
	}
	
	public static String getLongest(String str){
		int i=0;
		int bigIndex =0;
		StringBuilder ans = new StringBuilder();
		while( i <= str.length()){
			// checkString(str.substring(0, i));
			 for(String word: list){
					if(word.trim().equals(str.substring(bigIndex, i))){
						bigIndex = word.length();
						ans.append(word);
						
					}
					
				}
			 i++;
		}
		return null;
		
	}

}




 
