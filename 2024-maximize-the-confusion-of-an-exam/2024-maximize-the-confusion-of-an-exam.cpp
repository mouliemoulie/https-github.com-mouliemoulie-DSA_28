class Solution {
public:
    int maxConsecutiveAnswers(string answerKey, int k) {
        int l=0;
        int h=answerKey.size();
        int mx=0;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(findconsecutiveones(answerKey,k,'T',mid) || findconsecutiveones(answerKey,k,'F',mid)){
                mx=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return mx;
    }
private:
    int findconsecutiveones(string ans,int k,char ch,int maxval){
        int chgcnt=0;
        for(int i=0;i<maxval;i++){
            if(ans[i]!=ch) chgcnt++;
        }
        if(chgcnt<=k) return true;
        for(int i=maxval;i<ans.size();i++){
            if(ans[i-maxval]!=ch) chgcnt--;
            if(ans[i]!=ch) chgcnt++;
            if(chgcnt<=k) return true;
        }
        return false;
    }
};