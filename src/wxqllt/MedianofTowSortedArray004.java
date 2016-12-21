package wxqllt;

import java.util.ArrayList;

public class MedianofTowSortedArray004 {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int l1 = nums1.length;
		int l2 = nums2.length;
		if (l1 == 0) {
			if (l2 % 2 == 0) {
				return (nums2[l2 / 2] + nums2[l2 / 2 - 1]) / 2.0;
			} else {
				return nums2[l2 / 2];
			}
		} else if (l2 == 0) {
			if (l1 % 2 == 0) {
				return (nums1[l1 / 2] + nums1[l1 / 2 - 1]) / 2.0;
			} else {
				return nums1[l2 / 2];
			}
		} else {

			int[] resultlist = new int[nums1.length + nums2.length];
			int i = 0;
			int j = 0;
			int k = 0;
			while (i <= nums1.length - 1 && j <= nums2.length - 1) {
				if (nums1[i] >= nums2[j]) {
					resultlist[k] = nums2[j];
					j++;
					k++;
				} else {
					resultlist[k] = nums1[i];
					i++;
					k++;
				}
			}

			if (i > nums1.length - 1) {
				for (; j < nums2.length; j++) {
					resultlist[k] = nums2[j];
					k++;
				}
			} else if (j > nums2.length-1) {
				for (; i < nums1.length; i++) {
					resultlist[k] = nums1[i];
					k++;
				}

			}

			if (resultlist.length % 2 == 0) {
				return (resultlist[resultlist.length / 2] + resultlist[resultlist.length / 2 - 1]) / 2.0;

			} else {
				return (resultlist[resultlist.length / 2]);
			}
		}
	}

	private static int binarysearch(int[] array, int target) {
		int head = 0;
		int end = array.length - 1;
		while (head <= end && head <= array.length - 1 && end <= array.length - 1) {
			int middle = (head + end) / 2;
			if (target == array[middle]) {
				return middle;
			} else if (target > array[middle]) {
				head = middle + 1;
			} else {
				end = middle - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// System.out.println(3 / 2);
		MedianofTowSortedArray004 test = new MedianofTowSortedArray004();
		int[] nums1 = {1};
		int[] nums2 = {1};
		System.out.println(test.findMedianSortedArrays(nums1, nums2));
	}
}
