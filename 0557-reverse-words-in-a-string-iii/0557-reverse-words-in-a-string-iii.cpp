class Solution {
public:
    string reverseWords(string s) {
                stringstream ss(s);
        string word,res;
        while(ss>>word){
            reverse(word.begin(),word.end());
            res+=word+" ";
        }
        if(!res.empty()) res.pop_back();
        return res;
    }
};