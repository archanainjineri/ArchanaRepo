
public class ReverseStrWithSpace {

	public static void main(String[] args){
		
		String s = "I am Not String";
		//StringBuilder result = null;
		reverseStringPreserveSpace(s);
	
	}
	
	public static void reverseStringPreserveSpace(String s){
		Character[] StrArray = new Character[s.length()];
		
		for (int i = 0; i<s.length() ; i++){
			StrArray[i] = s.charAt(i);
			System.out.print(StrArray[i]);

		}
		int l = StrArray.length;
		
		
		for (int i=0,j=14; i < 7 && j > 7; i++,j-- )
		{
			//if(StrArray[i] != ' '){
			System.out.println("i = "+ i + " j = "+ j);
					char temp = StrArray[i];
					StrArray[i] = StrArray[j];
					StrArray[j] = temp;
			//}		
					
		}
		System.out.println();
		for (int i = 0; i<s.length() ; i++){
			
			System.out.print(StrArray[i]);

		}
	}
	
}
