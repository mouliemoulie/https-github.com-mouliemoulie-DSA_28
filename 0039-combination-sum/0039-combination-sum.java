class Solution {
    public List<List<Integer>> combinationSum(int[] c, int t) {
        List<List<Integer>> ans=new ArrayList<>();
        findcoms(c,t,0,new ArrayList<>(),ans);
        return ans;
    }
    private void findcoms(int[] c,int t,int i,ArrayList<Integer> ds,List<List<Integer>> ans){
        if(i==c.length){
            if(t==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(c[i]<=t){
            ds.add(c[i]);
            findcoms(c,t-c[i],i,ds,ans); 
            ds.remove(ds.size()-1);
        }
        findcoms(c,t,i+1,ds,ans);
    }
}