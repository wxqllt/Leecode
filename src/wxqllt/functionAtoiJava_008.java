package wxqllt;
/***
 * 
 * 
 * 这题好sb
 * @author wxqllt
 *
 */
public class functionAtoiJava_008 {
	public int myAtoi(String str) {
		if (str.length() == 0) {
			return 0;
		}
		if (str.length() == 1) {
			if (48 <= str.charAt(0) && str.charAt(0) <= 57) {
				return Integer.valueOf(str);
			} else {
				return 0;
			}
		}
		// str.length > 1
		else {
			int m = 0;
			while(str.charAt(m)==' '){
				m++;
			}
			str = str.substring(m);
			int i = 0;
			String filtrateStr = "";
			while (i < str.length()) {
				if ((str.charAt(i)<48||str.charAt(i)>57)&&str.charAt(i)!='+'&&str.charAt(i)!='-') {
					break;
				}
				if ((48 <= str.charAt(i) && str.charAt(i) <= 57) || (str.charAt(i) == '-') || str.charAt(i) == '+') {
					filtrateStr += String.valueOf(str.charAt(i));
				}
				i++;
			}

			if (filtrateStr.length() > 1) {
				if (filtrateStr.charAt(0) == '-' && (48 <= filtrateStr.charAt(1) && filtrateStr.charAt(1) <= 57)) {
					int j = 1;
					while (filtrateStr.charAt(j) == '0'&&filtrateStr.length()>2) {
						j++;
					}
					String temps = filtrateStr.substring(j);

					if (filtrateStr.length() > String.valueOf(Integer.MIN_VALUE).length()) {
						return Integer.MIN_VALUE;
					} else {
						long res = Long.valueOf(temps);
						if(-res < Integer.MIN_VALUE){
							return Integer.MIN_VALUE;
						}else
						return -(int) res;
					}
				} else if (filtrateStr.charAt(0) == '+' && (48 <= filtrateStr.charAt(1) && filtrateStr.charAt(1) <= 57)) {
					int j = 1;
					while (filtrateStr.charAt(j) == '0'&&filtrateStr.length()>2) {
						j++;
					}
					String temps = filtrateStr.substring(j);
					if (temps.length() > String.valueOf(Integer.MAX_VALUE).length()) {
						return Integer.MAX_VALUE;
					} else {
						long res = Long.valueOf(temps);
						if (res > Integer.MAX_VALUE) {
							return Integer.MAX_VALUE;
						} else
						return (int) res;
					}
				} else if((48 <= filtrateStr.charAt(0) && filtrateStr.charAt(0) <= 57)){
					if (filtrateStr.length() > String.valueOf(Integer.MAX_VALUE).length()) {
						return Integer.MAX_VALUE;
					} else {
						long res = Long.valueOf(filtrateStr);
						if (res>Integer.MAX_VALUE) {
							return Integer.MAX_VALUE;
						} else
						return (int) res;
					}
				}else {
					return 0 ;
				}
			} 
			else if (filtrateStr.length() == 0) {
				return 0;
			} 
			else {
				if (48 <= filtrateStr.charAt(0) && filtrateStr.charAt(0) <= 57) {
					return Integer.valueOf(filtrateStr).intValue();
					} 
					else{
					return 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		functionAtoiJava_008 test = new functionAtoiJava_008();
		System.out.println(test.myAtoi("-1"));
	}
}
