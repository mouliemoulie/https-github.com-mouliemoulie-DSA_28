class Solution {
public:
    double average(vector<int>& s) {
        auto min = std::min_element(s.begin(), s.end());
        auto max = std::max_element(s.begin(), s.end());
        
        int totalSum = std::accumulate(s.begin(), s.end(), 0);
        int sumWithoutMinMax = totalSum - (*min) - (*max);  // Dereference min and max iterators
        
        int l = s.size() - 2;
        return static_cast<double>(sumWithoutMinMax) / l;  // Ensure floating-point division
    }
};