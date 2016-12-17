package wxqllt;

import java.util.HashMap;
/****
 * 
 * 数组循环
 * @author wxqllt
 *
 */
public class TwoSum001 {
	public int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {

				res[0] = map.get(target - nums[i]);
				res[1] = i;
				return res;
			} else {
				map.put(nums[i], i);
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(6/10);
	}
}
