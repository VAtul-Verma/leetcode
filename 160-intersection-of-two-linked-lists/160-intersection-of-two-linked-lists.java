/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;          //loop deceted
            }
        }
        if(fast==null || fast.next==null){
            return null;       //ager loop nahi he to fast ya to null hoga ya fir fast ka next null hoga to wahi return ka denge
        }
        ListNode curr1=head,curr2=slow;
        while(curr1!=curr2){
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return curr2;
        
        
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
     ListNode tailB=headB;
        while(tailB.next!=null){
            tailB=tailB.next;
        }
        
        tailB.next=headB;
        ListNode ans=detectCycle(headA);
        tailB.next=null;
        return ans;
    }
}