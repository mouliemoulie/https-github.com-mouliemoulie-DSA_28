class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if (s.length == 0 || g.length == 0) return 0;

        Arrays.sort(g);
        Arrays.sort(s);

       int i=0,j=0;
       while(i< g.length && j<s.length){
        if(s[j]>=g[i]){
            i++;
        }
        j++;
       }
       return i;
    }


       /* if(s.length==0 && g.length>0) return 0;
        Arrays.sort(s);
        int cnt=0;
        for(int i:g){
            int indx=poscook(s,i);
            if(indx>=0) cnt+=1;
        }
        return cnt;  
    }
    private int poscook(int[] s, int x){
        int l=0,h=0;
        if(s.length==1){
            return s[0];
        }
        l=s[0];
        h=s[s.length-1];
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(s[mid]>=x){
                ans=mid;
                h=mid-1;
            }
            else l=mid+1;
        }
        return ans;
    }*/
}