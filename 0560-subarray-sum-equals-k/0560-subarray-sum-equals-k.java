class Solution {
    public int subarraySum(int[] arr, int k) {
        int sum=0,j=0,cnt=0;
        Map<Integer,Integer> h=new HashMap<>();
        h.put(0,1);
        while(j<arr.length){
            sum+=arr[j];
            if(h.get(sum-k)!=null){
                cnt+=h.get(sum-k);
            }
            //Integer prev=h.get(sum-k);
            /*if(prev==null){
                h.put(sum,1);
            }
            else{
                h.put(sum,prev+1);
            }*/
            h.put(sum,h.getOrDefault(sum,0)+1);
            j++;
        }
        return cnt;
    }
}