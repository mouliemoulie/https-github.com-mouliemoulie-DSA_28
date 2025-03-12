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
    ListNode* reverseList(ListNode* head) {
        ListNode* curr=head;
        //ListNode* nxt=head->next;
        ListNode* prev=nullptr;
        return reverselist(curr,prev);
    }
    private:
    ListNode* reverselist(ListNode* curr,ListNode* prev){
    if(curr==nullptr) return prev;
    ListNode* nxt=curr->next;
    curr->next=prev;
    prev=curr;
    curr=nxt;
    return reverselist(curr,prev);
    }
};