class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);
        int sum=0,cnt=0;
        for(int i=0;i<=s.length()-k;i++){
            sum=Integer.parseInt(s.substring(i,i+k));
            if(sum!=0 && num%sum==0) cnt+=1;
        }   
        
        return cnt;
    }
}