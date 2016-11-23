/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode tmp_head = head;
        ListNode prev_head = null;
        ListNode nxt_head;
        ListNode new_head;
        while(true){
            
            if(tmp_head == null) {new_head = prev_head;break;}
            nxt_head = tmp_head.next;
            tmp_head.next = prev_head;
            prev_head = tmp_head;
            tmp_head = nxt_head;
            
        }
        
       return new_head;
    }
}