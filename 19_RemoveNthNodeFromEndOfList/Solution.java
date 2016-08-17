/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ln = new ListNode(0);
        ln.next = head;
        head = ln;
        int size = 0;
        while(ln != null){
        	size++;
        	ln = ln.next;
        }
        ln = head;
        int count = size - n;
        while(count > 1){
        	ln = ln.next;
        	count--;
        }
        ln.next = ln.next.next;
        return head.next;
    }
}