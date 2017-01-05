package wxqllt;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.IntPredicate;

public class ZigZagConversion006 {
	
	
	private Map<Integer, ArrayList<String>> map ;
	
	public String convert(String s, int numRows) {
		int[][] array = new int[numRows][s.length()];
		int count = 0;
		if (numRows <= 1) {
			return s;
		}
		else {
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < numRows; j++) {
				if( (i % (numRows - 1) == 0)&&count < s.length())  {
					array[j][i] = s.charAt(count);
					count++;
				}else if (((i+j)%(numRows -1) == 0)&&count < s.length()){
					array[j][i] = s.charAt(count);
					count++;
				} 
			}
			if (count > s.length()) {
				break;
			}
		}
		char[] res = new char[s.length()];
		int k = 0;
		for (int m = 0; m < numRows; m++) {
			for (int n = 0; n < s.length(); n++) 
			{
				if (array[m][n] >0) {
					res[k] = (char)array[m][n];
					k++;
				}
				
			}
		}
		return String.valueOf(res);
		}
	}
	
	


	public static void main(String[] args) {
		ZigZagConversion006 test = new ZigZagConversion006();
		System.out.println(test.convert("abcdef", 3));
	
	}
}
