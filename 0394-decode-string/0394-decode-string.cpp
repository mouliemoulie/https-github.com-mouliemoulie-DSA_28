class Solution {
public:
    string decodeString(string s) {
         stack<int> nst;  // Stack to store numbers
        stack<string> sst;  // Stack to store substrings
        
        for (int i = 0; i < s.size(); i++) {
            if (s[i] == ']') {
                string ans = "";
                while (!sst.empty() && sst.top() != "[") { // Pop till '['
                    ans = sst.top() + ans;  
                    sst.pop();
                }
                sst.pop(); // Remove '['

                int n = nst.top(); // Get the multiplier
                nst.pop();

                string repeated = "";
                while (n-- > 0) repeated += ans; // Repeat the substring

                sst.push(repeated); // Push the expanded string back to stack
            }
            else if (isdigit(s[i])) {
                int num = 0;
                while (isdigit(s[i])) {  // Extract full number (e.g., "12")
                    num = num * 10 + (s[i] - '0');
                    i++;
                }
                i--; // Adjust index after reading number
                nst.push(num);
            }
            else if (s[i] == '[') {
                sst.push("[");
            }
            else { // It's a letter
                sst.push(string(1, s[i])); // Convert char to string and push
            }
        }

        string res = "";
        while (!sst.empty()) {
            res = sst.top() + res;
            sst.pop();
        }
        return res;
    }
};