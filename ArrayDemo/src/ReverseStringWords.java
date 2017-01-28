
public class ReverseStringWords {

	public static void main(String[] args){
		String str = "My Name is Archana" ; 
		String[] s = str.split(" ");
		StringBuilder reverse = new StringBuilder(str.length());
		
		for ( int i = s.length-1; i>=0 ; i--){
			reverse.append(s[i]+' ');			
		}
		System.out.println(reverse);
	}
}
