/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* insertGreatestCommonDivisors(ListNode* head) {
        if(head==nullptr || head->next==nullptr) return head;
        ListNode* prev=head;
        ListNode* temp=head->next;
        while(temp!=nullptr){
            ListNode* gcdNode=new ListNode(gcd(prev->val,temp->val));
            prev->next=gcdNode;
            gcdNode->next=temp;
            prev=temp;
            temp=temp->next;
        }
        return head;
    }
};