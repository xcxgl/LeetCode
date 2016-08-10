/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
           	ListNode result = new ListNode(-1);
    	ListNode pointer = result;
    	int tens = 0;
        while(l1 != null && l2 != null){
            ListNode ln = new ListNode((l1.val + l2.val + tens) % 10);
            tens = (l1.val + l2.val + tens) / 10;
            l1 = l1.next;
            l2 = l2.next;
            pointer.next = ln;
            pointer = pointer.next;
        }
        while(l1 != null){
            ListNode ln = new ListNode((l1.val + tens) % 10);
            tens = (l1.val + tens) / 10;
            l1 = l1.next;
            pointer.next = ln;
            pointer = pointer.next;
        }
         while(l2 != null){
            ListNode ln = new ListNode((l2.val + tens) % 10);
            tens = (l2.val + tens) / 10;
            l2 = l2.next;
            pointer.next = ln;
            pointer = pointer.next;
        }
        if(tens != 0){
        	ListNode ln = new ListNode(tens);
        	pointer.next = ln;
        }
        return result.next;
    }
}