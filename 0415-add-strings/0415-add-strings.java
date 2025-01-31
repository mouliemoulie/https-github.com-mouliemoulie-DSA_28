class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder res=new StringBuilder();
        //char c1='';
        //char c2='';
        //for(int i=0;i<Math.max(num1.length(),num2.length());i++){
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry>0){
            int d1=(i>=0)? num1.charAt(i)-'0':0;
            int d2=(j>=0)? num2.charAt(j)-'0':0;
               int sum=d1+d2+carry;
               carry=sum/10;
               res.append(sum%10);
            i--;
            j--;
            }
        return res.reverse().toString();
    }
}