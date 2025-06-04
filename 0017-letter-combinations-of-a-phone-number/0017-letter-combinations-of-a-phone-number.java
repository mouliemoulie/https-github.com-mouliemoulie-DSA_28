class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty())
            return new ArrayList<>();
        return per("", digits);
    }

    private static final String[] KEYPAD = {
            "", // 0
            "", // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs", // 7
            "tuv", // 8
            "wxyz" // 9
    };

    private static ArrayList<String> per(String p, String u) {
        ArrayList<String> res = new ArrayList<>();

        if (u.isEmpty()) {
            res.add(p);
            return res;
        }

        char ch = u.charAt(0);
        int digit = ch - '0';
        String letters = KEYPAD[digit];

        for (int i = 0; i < letters.length(); i++) {
            res.addAll(per(p + letters.charAt(i), u.substring(1)));
        }

        return res;
    }
}