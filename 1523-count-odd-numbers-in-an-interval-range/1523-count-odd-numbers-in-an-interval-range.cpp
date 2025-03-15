class Solution {
public:
    int countOdds(int l, int h) {
        int cnt=0;
        for(int i=l;i<=h;i++){
            if(i%2!=0) cnt+=1;
        }
        return cnt;
    }
};