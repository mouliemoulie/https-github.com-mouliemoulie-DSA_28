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
    public ListNode swapPairs(ListNode head) {
        ListNode temp1=head;
        if(temp1==null){
            return head;
        }
        if(temp1.next==null){
            return head;
        }
        while(temp1!=null && temp1.next!=null){
            ListNode temp2=temp1.next;
            int tval1=temp1.val;
            int tval2=temp2.val;
            temp1.val=tval2;
            temp2.val=tval1;
            temp1=temp2.next;
        }
        return head;
    }
}