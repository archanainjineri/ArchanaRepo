package serviceNow;

import java.util.Arrays;
import java.util.Comparator;

public class StringOfNumbers {

	public static void main(String[] args) {
		String string = "3 42 \n   11   \t  7  dsfss  365          \r   1";
	    String[] numbers = string.split("\\D+");
	    //Arrays.sort(numbers,new StringCompare());
	    System.out.println(Arrays.toString(numbers));
	    
	    String str = "84 86 4525 27 2829";
	    String[] a = str.split(" ");
	    
	    String str2 ="84864525272829";
	    String[] b = str2.split("");
	    Arrays.sort(b,new StringCompareReverse());

	    System.out.println(Arrays.toString(b));

	  }

}

class StringCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2)
    {
      return Integer.valueOf(s1).compareTo(Integer.valueOf(s2));
    }
	
}

//String compare reverse order
class StringCompareReverse implements Comparator<String>{

	@Override
	 public int compare(String o1, String o2) {
        return extractInt(o2) - extractInt(o1);
    }
    int extractInt(String s) {
        String num = s.replaceAll("\\D", "");
        // return 0 if no digits found
        return num.isEmpty() ? 0 : Integer.parseInt(num);
    }

}

