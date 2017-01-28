/*
public class ReverseString {
	public static void main(String[] args){
		String s = "My name is archana";

		char[] res= stringReverseInPlace(s.toCharArray());
		for (int i = 0; i<res.length;i++){
		System.out.println(res[i]);}
	
}
	
	public static char[] stringReverseInPlace(char[] string) {
		  for(int i = 0, j = string.length - 1; i < string.length / 2; i++, j--) {
		    char c = string[i];
		    string[i] = string[j];
		    string[j] = c;
		  }
		  return string;
		}
}

*/