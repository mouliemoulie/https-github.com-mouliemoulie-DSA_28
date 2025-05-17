class Solution {
    public String[] findRelativeRanks(int[] s) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->s[b]-s[a]);
        for(int i=0;i<s.length;i++){
            pq.add(i);
        }
        //int max=-1;
        //max=s[pq.peek()];
        int r=1;
        String[] m=new String[s.length];
        for(int k=0;k<s.length;k++){
            int idx=pq.poll();
            if(r==1){
                m[idx]="Gold Medal";
            }
            else if(r==2){
                m[idx]="Silver Medal";
            }
            else if (r==3){
                m[idx]="Bronze Medal";
            }
            else{
                m[idx]=String.valueOf(r);
            }
            r++;
        }
        return m;
    }
}