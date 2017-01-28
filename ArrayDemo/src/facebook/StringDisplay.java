
/*
 * Write code to decode strings. For example, String str = "3[a2[bd]g4[ef]h]", 
 * the output should be "abdbdgefefefefhabdbdgefefefefhabdbdgefefefefh". 
 */
package facebook;
public class StringDisplay {

	public static void main(String[] args) {
	String[] L = {"This", "is","a","document"};
	String[] M = {"This", "is","is","a","document","document"};
	
	if(is_all_items_in_list(L, M)){
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
	}
	
	static boolean is_all_items_in_list(String[] L, String[] M) {
	    int i =0 ;
        int j= 0;
        int l = L.length;
        int m = M.length;
        boolean flag = true;
        int count = 0;
	  while( i< l && j< m){		  
		  if(!L[i].equals(M[j]) )
			 j++;
		  else if(L[i].equals(M[j])){
			 j++;
             i++;
		  }
	  }

    if(i == l){
     return true;
    }  
        else
            return false;
}
}

