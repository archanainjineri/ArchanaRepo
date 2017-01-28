// Java prigram to remove duplicates
import java.util.*;
 
class DupString
{
    /* Function removes duplicate characters from the string
    This function work in-place */
    void removeDuplicates(String str)
    {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));
         
        // print string after deleting duplicate elements
        for(Character ch : lhs)
            System.out.print(ch);
    }
    
    void removeDuplicateWords(String str)
    {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        String[] subStr = str.split(" ");
        for(int i=0;i<subStr.length;i++)
            lhs.add(subStr[i]);
         
        // print string after deleting duplicate elements
        for(String s : lhs)
            System.out.print(s +" ");
    }
     
    /* Driver program to test removeDuplicates */
    public static void main(String args[])
    {
        String str = "aaaaaabb";
        String words = "aaa bbb aaa ccc";
        DupString r = new DupString();
        //r.removeDuplicates(str);
        r.removeDuplicateWords(words);
    }
}