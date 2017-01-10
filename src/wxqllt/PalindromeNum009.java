package wxqllt;
/****
 * 
 * 
 * 负数没有回文数！！
 */
public class PalindromeNum009 {
	public boolean isPalindrome(int x) {
		
		if (x==0) {
			return true;
		}
		if (x < 0 ) {
			return false;
		}
		else {
		//x = Math.abs(x);
		int xx = x;
		int num = 1;
		while (xx / 10 > 0) {
			xx = xx / 10;
			num++;
		}
		System.out.println(num);
		if (num % 2 == 0) {
			int index = 1;
			while (num != index - 1) {
				int a = ((x/(int)Math.pow(10, index-1))%10);
				int b = (x/(int)Math.pow(10, num-1))%10;
				if (a == b) {
					index++;
					num--;
				} else {
					return false;
				}
			}
			return true;
		} else {
			int i = 1;
			while (num != i) {
				int c = ((x/(int)Math.pow(10, i-1))%10);
				int d = (x/(int)Math.pow(10, num-1))%10;
				if (c == d ) {
					i++;
					num--;
				} else {
					return false;
				}
			}
			return true;
		}
	}	
}
	public static void main(String[] args) {
		PalindromeNum009 test = new PalindromeNum009();
		System.out.println(test.isPalindrome(10001));
		System.out.println(Integer.MIN_VALUE);
		
		
	}
}
