class Solution {
public:
    int countPrimeSetBits(int left, int right) {
        unordered_set<int> v={2,3,5,7,11,13,17,19};

        /*for(int i=2;i*i<=right;i++){
            if(v[i]==1){
                for(int j=i*i;j<=right;j+=i){
                    v[j]=0;
                }
            }
        }*/
        int cnt=0;
        for(int i=left;i<=right;i++){
            int s=__builtin_popcount(i);
            if(v.count(s)) cnt+=1;
        }
        return cnt;
    }
};