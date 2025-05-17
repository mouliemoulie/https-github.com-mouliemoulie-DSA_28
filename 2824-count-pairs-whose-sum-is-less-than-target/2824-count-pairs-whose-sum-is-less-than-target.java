class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int cnt=0;
        //TreeSet<Integer> ts=new TreeSet<>();
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if((nums.get(i)+nums.get(j))<target){
                    //ts.add((nums.get(i)+nums.get(j)));
                    cnt+=1;
                } 
            }
        }
        //int res=ts.size();
        return cnt;
    }
}