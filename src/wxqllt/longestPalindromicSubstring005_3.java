package wxqllt;

import javax.print.attribute.standard.PagesPerMinute;

/***
 * 使用Manacher’s Algorithm算法具体google
 * @author wxqllt
 *
 */
public class longestPalindromicSubstring005_3 {	
	public String longestPalindrome(String s) 
	{
		if (s.length() == 0) {
			return "^$";
		}
		String simbol = "^";
		for(int j = 0; j< s.length();j++){
			
				simbol += "#"+s.substring(j, j+1);
				
		}
		String t = simbol+"#$";
		int[] p = new int[t.length()];
		int r = 0;
		int c = 0;
		for (int i = 1; i < p.length-1; i++) {
			int itemp = c - (i-c);
			if (r > i) {
			  p[i] = Math.min(r-i, p[itemp]); 
			}
			else {
				p[i]= 0;
			}
			while(s.charAt(i+p[i])== s.charAt(i-p[i]))
				p[i]++;
			if(i+p[i]> r){
				c = i;
				r = i+p[i];	
				
			}
			
		}
		
		
		return null;
		
		
		
		
	}
	
	

}
