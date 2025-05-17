class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> res=new ArrayList<>();
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        int i=0,k=0;
        for(int n:nums){
            if(n<0) neg.add(n);
            else pos.add(n);
        }
        int m=Math.min(pos.size(),neg.size());
        for(int j=0;j<m;j++){
            res.add(pos.get(j));
            res.add(neg.get(j));
        }
        int[] resArray = new int[res.size()];
        for (int j = 0; j < res.size(); j++) {
            resArray[j] = res.get(j);
        }
        return resArray;
    }
}