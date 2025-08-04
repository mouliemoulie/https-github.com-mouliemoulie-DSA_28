class Solution {
public:
    int countNumbersWithUniqueDigits(int n) {
        if(n==0) return 1;
        int ans=10;
        int st=9;
        int curr=9;
        while(n-->1 && st){
            curr*=(st--);
            ans+=curr;
        }
        return ans;
    }
};