class Solution {
    public int minimumChairs(String s) {
        int el=0;
        int mx=Integer.MIN_VALUE;
        for(char ch:s.toCharArray()){
            if(ch=='E') el+=1;
            else el-=1;
            mx=Math.max(el,mx);
        }
        return mx;
    }
}