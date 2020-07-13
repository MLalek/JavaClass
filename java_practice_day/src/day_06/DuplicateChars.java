package day_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateChars {
	 /*
     *  Write a code that returns the duplicate chars in a String array
     * e.g.
     * String str=“ilovejavatoo”
     * Output: o v a
     */

	 public static void main(String[] args) {
	        String str="ilovejavatoo";
	        char[] ch=str.toCharArray();
	        System.out.println(Arrays.toString(ch)); // [i, l, o, v, e, j, a, v, a, t, o, o]
	        List<Character> uniqueChars=new ArrayList();
	        Arrays.sort(ch);
	        
	        for(int i=0;i<ch.length-1;i++) {
	            if(ch[i]==ch[i+1]&&!uniqueChars.contains(ch[i])) {
	                uniqueChars.add(ch[i]);
	            }
	        }
	        
	        System.out.println(uniqueChars); //[a, o, v]

	}

}
