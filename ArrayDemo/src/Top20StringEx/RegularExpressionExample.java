package Top20StringEx;

import java.util.regex.Pattern;

//check the string contains only digits
public class RegularExpressionExample {
	public static void main(String[] args){
	String str = "123.999";
	Pattern pattern = Pattern.compile(".*[^0-9].*");
	System.out.println(!pattern.matcher(str).matches());
	}

}
