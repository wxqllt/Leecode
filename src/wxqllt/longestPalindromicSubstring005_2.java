package wxqllt;

public class longestPalindromicSubstring005_2 		
{	
	private int lo;
	private int maxlen=1;
	public String longestPalindrome(String s) {
		if (s.length()<2) {
			return s;
		}
		for (int i = 0; i < s.length()-1; i++) {
			
			getPalindromicSubstring(s, i, i);
			getPalindromicSubstring(s, i, i+1);
		}
		
		return s.substring(lo, lo+maxlen);
		
	}
	private void getPalindromicSubstring(String s, int i,int k){
		while(i>=0&&k<s.length()&&s.charAt(i)==s.charAt(k)){
				i--;
				k++;
		}if (maxlen < k-i-1) {
			lo = i+1;
			maxlen = k-i-1;
		}	
	}
	public static void main(String[] args) {
		longestPalindromicSubstring005_2 test = new longestPalindromicSubstring005_2();
		System.out.println(test.longestPalindrome("abacd"));
		
	}
	
	
}
