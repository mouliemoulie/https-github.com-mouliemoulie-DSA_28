class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char,int> m;
        int r=0;
        int l=0;
        int mx=0;
        while(r<s.size()){
            m[s[r]]++;
            while(l<r && m[s[r]]>1){
                m[s[l]]--;
                if(m[s[l]]==0) m.erase(s[l]);
                l++;
            }
            mx=max(mx,r-l+1);
            r++;
        }
        return mx;
    }
};