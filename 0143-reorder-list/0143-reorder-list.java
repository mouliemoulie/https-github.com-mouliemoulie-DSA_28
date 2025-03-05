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
    public void reorderList(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode curr=s.next;
        s.next=null;
        ListNode prev=null;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        ListNode fst=head;
        ListNode snd=prev;
        while(snd!=null){
            ListNode t1=fst.next,t2=snd.next;
            fst.next=snd;
            snd.next=t1;
            fst=t1;
            snd=t2;
        }

        
    }
}