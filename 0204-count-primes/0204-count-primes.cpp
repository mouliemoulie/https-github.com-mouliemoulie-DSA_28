class Solution {
public:
    int countPrimes(int n) {
       vector<int> stera(n+1,1);
        for(int i=2;i*i<n;i++){
            if(stera[i]==1){
                for(int j=i*i;j<n;j+=i){
                    stera[j]=0;
                }
            }
        }
        int cnt=0;
        for(int i=2;i<n;i++){
            if(stera[i]==1) cnt+=1;
        }
        return cnt;
    }
};