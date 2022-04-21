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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy =new ListNode(-1);
        ListNode curr=head,prev=dummy;
        while(curr!=null){
            if(curr.val==val){
                ListNode temp=curr;
                 prev.next=temp.next;
                // curr=curr.next.next;
                curr=curr.next;
                temp=null;
                
            }else{
                prev.next=curr;
                prev=curr;
                curr=curr.next;
            }
        }
       return  dummy.next;    
    }
}