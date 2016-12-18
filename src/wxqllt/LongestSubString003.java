package wxqllt;

import java.nio.charset.MalformedInputException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.transform.Templates;

public class LongestSubString003 {
	
	 public int lengthOfLongestSubstring(String s) {
	     char[] str = s.toCharArray();
	     int[] array = new int[256];
	     for (int i = 0; i < array.length; i++) {
	    	 		array[i] = -1;
		}
	     int length = 0;
	     int start = 0;
	     for (int i = 0; i < str.length; i++) {
	    	 	if (array[str[i]]!=-1) {
	    	 		while(start <=array[str[i]]){
	    	 			array[str[start]] = -1;
	    	 			start++;
	    	 		}
	    	 	}
	    	 	length = Math.max(i-start+1, length);
	    	 	array[str[i]] = i;
		}
	     return length;	 
	 }
	 public static void main(String[] args) {
		
     	 LongestSubString003 test = new LongestSubString003();
		 System.out.println(test.lengthOfLongestSubstring("abcabcbb"));
		 
		 
		 
	}
}
