class Solution {
    public int numberOfSubstrings(String s) {
        int i=0,j=0,cnt=0;
        int n=s.length();
        Map<Character,Integer> hm=new HashMap<>();
        while(j<n){
            hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
            while(hm.getOrDefault('a',0)>=1 && hm.getOrDefault('b',0)>=1 && hm.getOrDefault('c',0)>=1){
                cnt+=(n-j);
                hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
               i++;
        }
        j++;
    }
    return cnt;
}
}