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
    ListNode* removeNodes(ListNode* head) {
        stack<int> st;
        ListNode*  cur=head;
        while(cur){
            while(!st.empty() && cur->val>st.top()) st.pop();
            st.push(cur->val);
            cur=cur->next;
        }
        ListNode* newHead=nullptr;
        //ListNode* dummy=newHead;
        while(!st.empty()){
            int v=st.top();
            ListNode* newnode=new ListNode(v);
            st.pop();
            newnode->next=newHead;
            newHead=newnode;
        }
        return newHead;
        
    }
};