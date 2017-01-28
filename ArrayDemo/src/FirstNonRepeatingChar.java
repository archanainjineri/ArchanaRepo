import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class FirstNonRepeatingChar {
	public static void main(String[] args){
		String s = "abcdabc";
		System.out.println("First non repeating char is : "+ getfirstNonRepeatingChar(s));
	}

	public static char getfirstNonRepeatingChar(String s){
		char[] charArray = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character ch: charArray){			
			if(map.containsKey(ch)){
			  map.put(ch, -1);
			}
			else {								
				 map.put(ch,1);
			}
		}
		System.out.println(new PrettyPrintingMap<Character, Integer>(map));
		Entry<Character, Integer> max = null;
		for (Entry<Character, Integer> entry : map.entrySet()) {
		    if (max == null || max.getValue() < entry.getValue()) {
		        max = entry;
		    }
		}

		return (max.getKey());
		
		
	}
}
 class PrettyPrintingMap<K, V> {
    private Map<K, V> map;

    public PrettyPrintingMap(Map<K, V> map) {
        this.map = map;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Entry<K, V>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Entry<K, V> entry = iter.next();
            sb.append(entry.getKey());
            sb.append('=').append('"');
            sb.append(entry.getValue());
            sb.append('"');
            if (iter.hasNext()) {
                sb.append(',').append(' ');
            }
        }
        return sb.toString();

    }
}
