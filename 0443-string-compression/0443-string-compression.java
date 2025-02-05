class Solution {
    public int compress(char[] chars) {
        int a=0;
        for(int i=0;i<chars.length;){
            final char l=chars[i];
            int cnt=0;
            while(i<chars.length && chars[i]==l){
                ++cnt;
                ++i;
            }
            chars[a++]=l;
            if(cnt>1){
                for(char ch:String.valueOf(cnt).toCharArray()){
                    chars[a++]=ch;
                }
            }
        }
        return a;
    }
}