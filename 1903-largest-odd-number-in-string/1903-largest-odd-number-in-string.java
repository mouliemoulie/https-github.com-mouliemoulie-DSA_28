class Solution {
    public String largestOddNumber(String num) {
        //long temp=Integer.valueOf(num);
        //if(temp%2!=0) return num;
        for(int i=num.length()-1;i>=0;i--){
            int t=Integer.valueOf(num.charAt(i));
            if(t%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}