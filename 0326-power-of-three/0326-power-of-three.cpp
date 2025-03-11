class Solution {
public:
    bool isPowerOfThree(int n) {
        if(n%3!=0) return false;
        return isPowerOfThree(n/3);
    }
};