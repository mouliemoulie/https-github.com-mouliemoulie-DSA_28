class Solution {
public:
    int countHomogenous(string s) {
        int ans=0;
        for(int i=0;i<s.size();i++){
            int j=i;
            int temp=0;
            int k=1;
            while(j<s.size() && s[i]==s[j]){
                temp=temp+k;
                k+=1;
                j++;
            }
            i=j-1;
            ans+=temp;
        }
        return ans;
    }
};