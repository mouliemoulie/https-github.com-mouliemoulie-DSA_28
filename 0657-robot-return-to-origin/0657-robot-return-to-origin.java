class Solution {
    public boolean judgeCircle(String m) {
        int l=m.length();
        int uc=0;
        int rc=0;
        for(int i=0;i<l;i++){
            if(m.charAt(i)=='U') uc+=1;
            else if(m.charAt(i)=='D') uc-=1;
            else if(m.charAt(i)=='R') rc+=1;
            else rc-=1;
        }
        if(uc==0 && rc==0) return true;
        else return false;
    }
}