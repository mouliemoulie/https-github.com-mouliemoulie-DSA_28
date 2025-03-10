class Solution {
public:
    int largestAltitude(vector<int>& g) {
        vector<int> ps;
        ps.push_back(0);
        int max=ps[0];
        int l=g.size();
        int sum=0;
        for(int i=0;i<l;i++){
            sum=g[i]+ps[i];
            ps.push_back(sum);
            if(sum>max) max=sum;
        }
        return max;
    }
};