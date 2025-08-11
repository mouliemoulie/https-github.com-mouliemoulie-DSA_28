class Solution {
public:
    int garbageCollection(vector<string>& garbage, vector<int>& travel) {
        int n = garbage.size();
        vector<int> precompute(n, 0);

        // Build prefix sum of travel times
        int time = 0;
        for (int i = 0; i < n; i++) {
            precompute[i] = time;
            if (i < travel.size()) time += travel[i]; // FIX: += instead of =
        }

        int m = 0, p = 0, g = 0; // counts of garbage
        int lastM = 0, lastP = 0, lastG = 0; // last house index for each type

        for (int i = 0; i < n; i++) {
            string s1 = garbage[i];
            for (char c : s1) {
                if (c == 'P') { p++; lastP = i; }
                else if (c == 'M') { m++; lastM = i; }
                else { g++; lastG = i; }
            }
        }


        int res = 0;
        res += m + precompute[lastM];
        res += p + precompute[lastP];
        res += g + precompute[lastG];

        return res;
    }
};
