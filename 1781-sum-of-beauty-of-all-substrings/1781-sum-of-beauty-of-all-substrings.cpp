class Solution {
public:
    int beautySum(string s) {
        int res=0;
        for(int i=0;i<s.size();i++){
            vector<int> freq(26,0);
            for(int j=i;j<s.size();j++){
                freq[s[j]-'a']++;
                res+=computebeauty(freq);
            }
        }
        return res;
    }
private:
    int computebeauty(vector<int>& freq){
        int mx=INT_MIN,mn=INT_MAX;
        for(int i:freq){
            if(i>0){
           mx=max(mx,i);
           mn=min(mn,i);
            }
        }
        return mx-mn;
    }
};