
public class ReverseStringRec {
	
	public static void main(String[] args){
		String s = "ABC";
		
		System.out.println(reverseString(s));
	}
	
	public static String reverseString(String s){
		if(s.length() ==0)
			return s;
		return reverseString(s.substring(1))+ s.charAt(0);
	}

}
