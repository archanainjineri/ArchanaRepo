
public class DiceRoll {

	public static void main(String[] args){
		roll("", 2);
	}
	 public static void roll(String s, int depth) {
	        if(depth == 0)
	            System.out.println(s.substring(1));
	        else
	            for(int i = 1; i <= 6; i++)
	                roll(s + "," + i, depth - 1);
	    }
}
