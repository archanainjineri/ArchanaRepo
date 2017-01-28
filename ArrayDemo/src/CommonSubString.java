import java.util.ArrayList;
import java.util.List;


public class CommonSubString {

	public static void main(String[] args){
		String s1 = "clcl";
		String s2 = "la lcl";
		
		System.out.println(getCommonSubstring(s1,s2));
		
	}	
	
	public static List<String> getCommonSubstring(String s1, String s2){
		
		List<String> result = null;
		int len1 = s1.length();
		int len2 = s2.length();
		Integer match[][] = new Integer[len1][len2];
		int max =Integer.MIN_VALUE;
		
		for (int i=0;i<len1 ; i++){
			for (int j=0; j<len2;j++){
				if(s1.charAt(i) == s2.charAt(j)){
					if(i ==0 || j ==0) match[i][j] =1;
					else {
						match[i][j] = match[i-1][j-1]+1;
					}
					
					if(match[i][j] > max){
						max = match[i][j];
						result = new ArrayList<String>();
						result.add(s1.substring(i-max+1,i+1));
					}
					if(match[i][j] == max){
						result = new ArrayList<String>();
						result.add(s1.substring(i-max+1,i+1));
					}
					
				}
				else
					match[i][j] =0;
			}
		}		
		return result;
	}
}
