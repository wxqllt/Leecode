package wxqllt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/***
 * 使用部分匹配数组的KMP算法
 * @author wxqllt
 *
 */
public class KMP {
	
	public int kmp(String s, String p){
		char[] sarray = s.toCharArray();
		char[] parray = p.toCharArray();
		int i = 0;
		int j = 0;
		while(i<s.length() && j < p.length()){
			if (sarray[i] == parray[j]) {
				i++;
				j++;
			}else
			 {	
				//若匹配长度大于1，则使用部分匹配值确认位移长度
				//否则i向右移一位
				if (j > 0) {
					int next = this.getnext(p.substring(0,j));
					int step = j - next;
					i = i - j + step;
					j = 0;
				}
				else{
					i = i-j+1;
					j = 0;
				}
			}
		}
		if (j == p.length()) {
			return i-j+1;
			
		}else {
			return -1;
		}	
	}
	/**
	 * 求已匹配字符串的"部分匹配"值
	 * 部分匹配值：已匹配字符串前缀和后缀的公共字符串的长度
	 * @param temps
	 * @return
	 */
	private int getnext(String temps){
		int res = 0;
		ArrayList<String> templist = new ArrayList<>();
		for (int i = 0; i < temps.length(); i++) {
			templist.add(temps.substring(0, i));
		}
		for (int j = 1; j < temps.length(); j++) {
			String temp = temps.substring(j, temps.length());
			if(templist.contains(temp)){
				res = temp.length();
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		KMP test = new KMP();
		System.out.println(test.kmp("abcdab", "bc"));
		//System.out.println(test.getnext("abcdabd"));
	}
}
