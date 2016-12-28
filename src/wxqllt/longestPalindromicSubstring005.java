package wxqllt;

import javax.security.auth.kerberos.KerberosKey;
import javax.swing.plaf.SliderUI;

/***
 * 方法一：动态规划
 * 
 * @author wxqllt
 * 
 */
public class longestPalindromicSubstring005 {
		public String longestPalindrome(String s) {
	        if(s.length() == 0)  
	        {  
	            return "";  
	        }  
	        if(s.length() == 1)  
	        {  
	            return s;  
	        }  
			boolean[][] temp = new boolean[s.length()][s.length()];
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < s.length(); j++) {
					if (i >= j) {
						temp[i][j] = true;
					} else {
						temp[i][j] = false;
					}
				}
			}
			int maxlen = 1;
			int step;
			int start = 0;
			int end = 0;
			// step步长，从小到大，所有step小的时候都情况都保存在temp数组中，
			// 因此可以这么写temp[i][j] = temp[i+1][j-1];
			for (step = 1; step < s.length(); step++) {
				for (int i = 0; step + i < s.length(); i++) {
					int j = i + step;
					if (s.charAt(i) != s.charAt(j)) {
						temp[i][j] = false;

					} else {
						temp[i][j] = temp[i + 1][j - 1];
						if (temp[i][j]) {
							if (step + 1 > maxlen) {
								maxlen = step + 1;
								start = i;
								end = j;
							}
						}
					}
				}
			}
			return s.substring(start, end + 1);
		
	    }
		
		
		public static void main(String[] args) {
			longestPalindromicSubstring005 test = new longestPalindromicSubstring005();
			System.out.println(test.longestPalindrome("cbbd"));
			
		}
}
