class Solution {
    public int maxDistance(int[] pos, int m) {
        Arrays.sort(pos);
        int l=0;
        int h=pos[pos.length-1]-pos[0];
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(frcposs(pos,mid,m)){
                ans=mid;
                l=mid+1;
            }
            else h=mid-1;
        }
        return ans;
    }
    boolean frcposs(int[] pos,int mid,int m){
        int cnt=1;
        int last=pos[0];
        for(int i=1;i<=pos.length-1;i++){
            if(pos[i]-last>=mid){
                cnt+=1;
                last=pos[i];
            }
            if(cnt>=m) return true;
        }
        return false;
        
    } 
}