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
    public ListNode partition(ListNode head, int c) {
        ListNode lhead=new ListNode(-1);
        ListNode ltail=lhead;
        ListNode rhead=new ListNode(-1);
        ListNode rtail=rhead;
        while(head!=null){
            if(head.val<c){
                ltail.next=head;
                ltail=head;
            }else{
                rtail.next=head;
                rtail=head;
            }
            head=head.next;
        }
        ltail.next=rhead.next;
        rtail.next=null;
        return lhead.next;
        
    }
}