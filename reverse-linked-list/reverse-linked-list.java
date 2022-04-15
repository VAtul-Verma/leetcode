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
    // public ListNode reverseList(ListNode head) {        //recursive code
    //     if(head==null || head.next==null){
    //         return head;
    //     }
    //     ListNode newhead=reverseList(head.next);
    //     ListNode headnt=head.next;
    //     head.next.next=head;
    //     head.next=null;
    //     return newhead;
    // }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode curr=head,prev=null;
        
        while(curr!=null){
        ListNode newhead=curr.next;
       curr.next=prev;
        prev=curr;
        curr=newhead;
    }
        
        return prev;
    }
}