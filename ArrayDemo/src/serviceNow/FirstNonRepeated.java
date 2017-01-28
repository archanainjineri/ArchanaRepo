package serviceNow;

/*
 * find the first non repeating character from the string.
 */
import java.util.HashMap;

public class FirstNonRepeated {

	public static void main(String[] args) {
		FirstNonRepeated obj = new FirstNonRepeated();
		String str = "Archana";
		System.out.println(obj.getFirstNonRepeated(str));

	}

	Character getFirstNonRepeated(String str){
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		char[] charArray = str.toLowerCase().toCharArray();
		for (int i=0 ; i < charArray.length ; i++){
			Character c = charArray[i];
			
			if(hashMap.containsKey(c)){
				hashMap.put(c,  hashMap.get(c)+1);
			}
			else{
				hashMap.put(c, 1);
			}
		}
		
		for ( int i=0; i< charArray.length ;i++){
			Character c = charArray[i];
			if(hashMap.get(c) == 1)
				return c;
			
		}
			return null;
		
		
	}
	
}
