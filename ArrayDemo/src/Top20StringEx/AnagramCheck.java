package Top20StringEx;

public class AnagramCheck {
	public static void main(String[] args){
		String s1 = "mary";
		String s2 = "armya";
		
		if(checkAnagram(s1,s2)){
			System.out.println("Given Strings are anagrams");
		}else{
			System.out.println("Given Strings are NOT anagrams");
		}

	}	

	public static boolean checkAnagram(String word, String anagram){
		char[] charArray = word.toCharArray();
		StringBuilder sb = new StringBuilder(anagram);
		if (word.length() != anagram.length()){
			return false;
		}
		for ( char ch : charArray){
			int index = sb.indexOf(""+ch);
			if( index != -1){
			 sb.deleteCharAt(index);
			}else{
				return false;
			}
		}
		if(sb.length() != 0) return false;
		else
		return true;		
		
	}
}
