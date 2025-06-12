class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int t) {
       Arrays.sort(c);
       List<List<Integer>> ans=findcoms(c,t,0,new ArrayList<>());
       return ans;
    }
    private List<List<Integer>> findcoms(int[]c,int t,int indx,List<Integer> ds){
        List<List<Integer>> res=new ArrayList<>();
            if(t==0) {
                res.add(new ArrayList<>(ds));
            return res;
            }
        for(int i=indx;i<c.length;i++){
            if(i>indx && c[i]==c[i-1]) continue;
            if(c[i]>t) break;
            
            ds.add(c[i]);
            res.addAll(findcoms(c,t-c[i],i+1,ds));
            ds.remove(ds.size()-1);
        }
        return res;
    }
}