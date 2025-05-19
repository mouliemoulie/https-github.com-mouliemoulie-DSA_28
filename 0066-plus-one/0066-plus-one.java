class Solution {
    public int[] plusOne(int[] d) {
        int[] res = new int[d.length + 1];
        int lst=d[d.length-1]+1;
        int carry = 0;
        if(lst<=9){
            d[d.length-1]=lst;
            return d;
        }
        else{
            carry=1;
        for (int i = d.length-1; i >= 0; i--) {
            if((carry+d[i])==10){
                res[i+1]=(carry+d[i])%10;
                carry=(carry+d[i])/10;
            }
            else{
                res[i+1]=(carry+d[i]);
                carry=(carry+d[i])/10;
            }
        }
    }
        if(carry>0){
            res[0]=1;
            return res;
        }
        else{
             int[] trim=Arrays.copyOfRange(res,1,res.length);
             return trim;
        }
       
    }
}