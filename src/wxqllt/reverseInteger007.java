package wxqllt;

import java.math.BigInteger;

public class reverseInteger007 {
	public int reverse(int x) {
		if (x == 0) {
			return x;
		}
		String s = String.valueOf(x);
		String firsts = s.substring(0, 1);
		
		if (firsts.equals("-")) {
		StringBuilder sb = new StringBuilder(s.substring(1));
		long res = Long.valueOf(sb.reverse().toString());
		if (-res < Integer.MIN_VALUE) {
			return 0;
		}	else {
			
			return -(int)res;
		}
	}else {
		StringBuilder sb = new StringBuilder(s);
		long res = Long.valueOf(sb.reverse().toString());
		if (res > Integer.MAX_VALUE) {
			return 0;
		}else {
			return (int)res;
		}
	}	
}
	
public static void main(String[] args) {
		reverseInteger007 test = new reverseInteger007();
		//System.out.println(-2147483648);
		System.out.println(test.reverse(-2147483648));
}
}