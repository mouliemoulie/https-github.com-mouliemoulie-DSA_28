class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         boolean[] freq=new boolean[nums.length];
        List<Integer> arr=new ArrayList<Integer>();
        List<List<Integer>> ans=new ArrayList<>();
        recurper(nums,freq,ans,arr);
        return ans;
    }
    static void recurper(int[] nums,boolean[] freq,List<List<Integer>> ans,List<Integer> arr){
        if(arr.size()==nums.length){
            if(!ans.contains(arr)) ans.add(new ArrayList<>(arr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                arr.add(nums[i]);
                recurper(nums,freq,ans,arr);
            freq[i]=false;
            arr.remove(arr.size()-1);
        }
    }
    }
}
   