class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,new ArrayList<>());
        return ans;
    }
    private void helper(int[] arr,int indx,List<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int i=indx;i<arr.length;i++){
            if(i!=indx && arr[i]==arr[i-1]) continue;
            ds.add(arr[i]);
            helper(arr,i+1,ds);
            ds.remove(ds.size()-1);
        }
    }
}