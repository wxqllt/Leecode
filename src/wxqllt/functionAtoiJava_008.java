package wxqllt;


public class functionAtoiJava_008 {
	public int myAtoi(String str) {
		String temp = "";
		int i = 0;
		if (str.length() == 0) {
			return 0;
		}
		// discard white
		while (i < str.length()) {
			if ((48 <= str.charAt(i) &&str.charAt(i) <= 57)||(str.charAt(i) =='-')) {
				temp += String.valueOf(str.charAt(i));
			}
			i++;
		}
		long res = 0;
		if (temp.length() == 0||temp.equals("-")) {
			return 0;
		}
		if (temp.charAt(0) =='-') {
			if (temp.length()> String.valueOf(Integer.MIN_VALUE).length()) {
				return 0;
			}
			temp = temp.substring(1);
			if (-res < Integer.MIN_VALUE)
			{
				return 0;
			} else 
			{
				res = Long.valueOf(temp);
				return (int) -res;
			}
		} else {
			if (temp.length() > String.valueOf(Integer.MAX_VALUE).length()) {
				return 0;
			}
			res = Long.valueOf(temp);
			if (res > Integer.MAX_VALUE) {
				return 0;
			} else {

				return (int) res;
			}
		}
	}
	public static void main(String[] args) {
		functionAtoiJava_008 test = new functionAtoiJava_008();
		System.out.println(test.myAtoi("-"));
	}
}
