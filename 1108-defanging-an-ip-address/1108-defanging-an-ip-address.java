class Solution {
    public String defangIPaddr(String a) {
        String res="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='.'){
                res+="[";
                res+=".";
                res+="]";
            }
            else if(a.charAt(i)!='.')res+=a.charAt(i);
        }
        return res;
    }
}