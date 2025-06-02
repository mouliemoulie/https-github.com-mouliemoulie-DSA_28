class Solution {
    public int totalFruit(int[] f) {
        int l=0;
        int r=0;
        int mx=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(r<f.length){
            hm.put(f[r],hm.getOrDefault(f[r],0)+1);
            if(hm.size()>2){
                int v=hm.get(f[l]);
                hm.put(f[l],v-1);
                if(hm.get(f[l])==0) hm.remove(f[l]);
                l++;
            }
            if(hm.size()<=2){
                mx=Math.max(mx,r-l+1);
            }
            r++;
        }
        return mx;
    }
}