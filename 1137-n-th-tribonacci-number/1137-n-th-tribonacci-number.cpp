class Solution {
public:
    int tribonacci(int n) {
        /*if(n<=1) return 1;
        return tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);*/
        if(n==1) return 1;
        int a=0;
        int b=1;
        int c=1;
        int sum=0;
        for(int i=2;i<n;i++){
            sum=a+b+c;
            a=b;
            b=c;
            c=sum;
        }
        return sum;
    }
};