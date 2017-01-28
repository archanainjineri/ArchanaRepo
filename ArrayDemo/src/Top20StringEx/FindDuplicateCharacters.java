package Top20StringEx;
import java.util.HashMap;
import java.util.Map;


public class FindDuplicateCharacters {

	public static void main(String[] args){
		String s = "Java" ;
		getDuplicateChars(s);
	}
	
	public static void getDuplicateChars(String s){
		char[] strArray = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for ( Character ch: strArray){
		if(map.containsKey(ch)){
			map.put(ch, map.get(ch)+1);			
		}
		else{
			map.put(ch, 1);
		}
		}	
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()){
			if(entry.getValue() > 1){
				System.out.printf("%s : %d %n ",entry.getKey(), entry.getValue());
			}
		}
		
	}
}
