class Solution {
    public int maxVowels(String s, int k) {
        char[] ch=s.toCharArray();
        String vow="aeiouAEIOU";
        //int k=4;
        int cnt=0;
        for(int i=0;i<k;i++){
            if(vow .contains(String.valueOf(ch[i])))
            cnt++;
        }
        int maxcnt=cnt;
        for(int i=k;i<s.length();i++){
            if(vow.contains(String.valueOf(ch[i-k]))){
                cnt--;
            }
            if(vow.contains(String.valueOf(ch[i]))){
                cnt++;
            }
            maxcnt=Math.max(cnt,maxcnt);
        }
        return maxcnt; 
    }
}