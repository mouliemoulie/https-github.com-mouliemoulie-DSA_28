class Solution {
    public int[][] merge(int[][] intervals) {
        int[][] res=new int[intervals.length][2];
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int[] newinterval=intervals[0];
        int i=0;
        boolean first=true;
        for(int[] interval:intervals){
            if(interval[0]<=newinterval[1]){
                newinterval[1]=Math.max(interval[1],newinterval[1]);
            }
            else{
                res[i++]=newinterval;
                newinterval=interval;
            }
        }
        res[i++]=newinterval;
        return Arrays.copyOf(res, i);
        
    }
}