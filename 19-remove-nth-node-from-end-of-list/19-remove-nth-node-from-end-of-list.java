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
   
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head.next==null){
           return null;
       }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null &&  n-->0){
            fast=fast.next;
        }
        if(n>=1){
            return null;
        }
        ListNode prev=null;
        while(fast!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }
          if(prev == null){
            //assign new head
            head = head.next;
        } else
        prev.next=slow.next;
        return head;
        
    }
}