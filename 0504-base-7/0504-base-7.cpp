class Solution {
public:
    string convertToBase7(int num) {
        if(num==0) return to_string(num);
        string res="";
        bool f=false;
        if(num<0) f=true;
        num=abs(num);
        while(num>0){
            res+=(to_string)(num%7);
            num/=7;
        }
        reverse(res.begin(),res.end());
        if(f) res="-"+res;
        return res;
    }
};