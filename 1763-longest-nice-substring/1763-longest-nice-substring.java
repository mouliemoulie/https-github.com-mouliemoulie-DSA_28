class Solution {
    public String longestNiceSubstring(String s) {
        int st = -1;
        int ei = -1;
        int mx = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (isNice(sub) && sub.length() > mx) {
                    st = i;
                    ei = j;
                    mx = sub.length();
                }
            }
        }

        return (st == -1) ? "" : s.substring(st, ei);
    }

    private boolean isNice(String str) {
        for (char c : str.toCharArray()) {
            if (!(str.indexOf(Character.toLowerCase(c)) != -1 &&
                  str.indexOf(Character.toUpperCase(c)) != -1)) {
                return false;
            }
        }
        return true;
    }
}
