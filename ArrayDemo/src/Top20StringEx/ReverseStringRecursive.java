package Top20StringEx;

public class ReverseStringRecursive {
	public static void main(String[] args){
		String s = "abcd";
		System.out.println(reverseRecursively(s));
	}

	public static String reverseRecursively(String str){
		if (str.length() < 2){
			return str;
		}
		return (reverseRecursively(str.substring(1)))+str.charAt(0);
	}
}
