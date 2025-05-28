class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0,t=0;
        for(int i:bills){
            if(i==5) f+=1;
            else if(i==10){
                if(f>0){
                    f-=1;
                    t+=1;
                }
                else return false;
            }
            else{
                if(f>0 && t>0){
                    f-=1;
                    t-=1;
                }
                else if(f>=3) f-=3;
                else return false;
            }
        }
        return true;
    }
}