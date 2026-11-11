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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        //find midpoint
        ListNode short1 = head;
        ListNode far = head;
        while (far.next != null && far.next.next != null) {
            short1 = short1.next;
            far = far.next.next;
        }
        //reverse second half list after midpoint
        ListNode preMiddle = short1;
        ListNode preCurrent = short1.next;
        while (preCurrent.next != null) {
            ListNode current = preCurrent.next;
            preCurrent.next = current.next;
            current.next = preMiddle.next;
            preMiddle.next = current;
        }
        //reorder
        short1 = head;
        far = preMiddle.next;
        while (short1 != preMiddle) {
            preMiddle.next = far.next;
            far.next = short1.next;
            short1.next = far;
            short1 = far.next;
            far = preMiddle.next;
        }
    }
}
