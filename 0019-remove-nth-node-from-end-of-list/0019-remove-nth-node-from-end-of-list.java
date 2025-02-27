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
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            temp=temp.next;
            length++;
        }
        if(length==1){
            head=null;
            return head;
        }
        if(n==length){
            head=head.next;
            return head;

        }
        
        int ind=length-n;
        temp=head;
        for(int i=1;i<ind;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}