class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int ec) {
        List<Boolean> ans=new ArrayList<>(); 
        for(int i=0;i<c.length;i++){
            int cnt=0;
            int sum=c[i]+ec;
            int j=0;
            while(j<c.length){
                if(sum>=c[j]) cnt++;
                j++;
            }
            if(cnt!=c.length) ans.add(false);
            else ans.add(true);
        }
        return ans;
    }
}