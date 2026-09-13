/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        // Stack<Integer> stack = new Stack<>();

        // while(head != null) {
        //     stack.push(head.val);
        //     head = head.next;
        // }

        // ListNode res = new ListNode(Integer.MIN_VALUE); time:O(n), space O(n)
        // ListNode ptr = res;

        // while(!stack.isEmpty()) {
        //     ptr.next = new ListNode(stack.pop());
        //     ptr = ptr.next;
        // }

        // return res.next;

        if (head == null) return null;
        if (head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }
}
