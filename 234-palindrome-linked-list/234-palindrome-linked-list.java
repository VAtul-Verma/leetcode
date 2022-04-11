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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        slow=reverse(slow);
        ListNode curr=head;
        while(slow!=null){
            if(slow.val!=curr.val){
                return false;
            }
            slow=slow.next;
            curr=curr.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head){
       
        ListNode pre=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode fast=curr.next;
            curr.next=pre;
            pre=curr;
            curr=fast;
        }
        return pre;
    }
}