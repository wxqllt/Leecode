package wxqllt;

import java.awt.image.RescaleOp;
/***
 * 链表、递归
 * @author wxqllt
 *
 */
public class AddTwoNumbers002 {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		return add(l1, l2, 0);

	}

	private ListNode add(ListNode l1, ListNode l2, int temp) {
		ListNode result = new ListNode(0);

		if (l1.next == null && l2.next == null) {
			if ((l1.val + l2.val + temp) >= 10) {
				result.val = (l1.val + l2.val + temp) % 10;
				ListNode lastone = new ListNode((l1.val + l2.val + temp)/10);
				result.next = lastone;
				return result;

			} else {
				result.val = l1.val + l2.val + temp;
				result.next = null;
				return result;
			}
		} else if (l1.next == null && l2.next != null) {
			if ((l1.val + l2.val + temp) >= 10) {
				result.val = (l1.val + l2.val + temp) % 10;
				ListNode tempnode =  new ListNode((l1.val + l2.val + temp)/10);
				result.next = add(tempnode, l2.next, 0);
				return result;
			} else {
				result.val = l1.val + l2.val + temp;
				result.next = l2.next;
				return result;
			}
		} else if (l1.next != null && l2.next == null) {
			if ((l1.val + l2.val + temp) >= 10) {
				result.val = (l1.val + l2.val + temp) % 10;
				ListNode tempnode =  new ListNode((l1.val + l2.val + temp)/10);
				result.next = add(l1.next, tempnode, 0);
				return result;
			} else {
				result.val = l1.val + l2.val + temp;
				result.next = l1.next;
				return result;
			}
		} else {
			if ((l1.val + l2.val + temp) >= 10) {
				result.val = (l1.val + l2.val + temp) % 10;
				int dividevalue = (l1.val + l2.val + temp) / 10;
				result.next = add(l1.next, l2.next, dividevalue);
				return result;
			} else {
				result.val = l1.val + l2.val + temp;
				result.next = add(l1.next, l2.next, 0);
				return result;

			}
		}

	}

}
