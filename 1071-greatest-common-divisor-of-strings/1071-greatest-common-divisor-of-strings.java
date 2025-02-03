import java.math.BigInteger;
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int lenGCD=BigInteger.valueOf(str1.length()).gcd(BigInteger.valueOf(str2.length())).intValue();
        //int lengcd=Intege.gcd(str1.length(),str2.length());
        return str1.substring(0,lenGCD);
    }
}