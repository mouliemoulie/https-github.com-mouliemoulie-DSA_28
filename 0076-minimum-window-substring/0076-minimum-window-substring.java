class Solution {
    public String minWindow(String s, String t) {
        int r=0,l=0,min=Integer.MAX_VALUE,cnt=0,si=-1;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:t.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1); //preinsert given "t" characters
        }
        while(r<s.length()){
            char rc=s.charAt(r);
            if (hm.containsKey(rc)) {
                  hm.put(rc, hm.get(rc) - 1);
                  if (hm.get(rc) >= 0) cnt++; // Count only if this character was needed
            }
            //if r is equal to that of t character then inc count
            while(cnt==t.length()){
                if(r-l+1 < min){
                    min=r-l+1;
                    si=l;
                }
                char lc=s.charAt(l);
               if (hm.containsKey(lc)) {
                    hm.put(lc, hm.get(lc) + 1);
                    if (hm.get(lc) > 0) cnt--;
                }
                l++;
            } 
            r++;
        }
        if(si<0){
            return "";
        }
        else{
            return s.substring(si,si+min);
        }
    }
}