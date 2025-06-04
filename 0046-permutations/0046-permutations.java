class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> input = Arrays.stream(nums).boxed().toList();
        per(new ArrayList<>(), input, res);
        return res;
    }

    public static void per(List<Integer> p, List<Integer> u, List<List<Integer>> res) {
        if (u.isEmpty()) {
            res.add(new ArrayList<>(p)); // add a copy of the current permutation
            return;
        }

        int ch = u.get(0);
        List<Integer> remaining = u.subList(1, u.size());

        for (int i = 0; i <= p.size(); i++) {
            List<Integer> f = new ArrayList<>(p.subList(0, i));
            List<Integer> s = new ArrayList<>(p.subList(i, p.size()));

            List<Integer> combined = new ArrayList<>();
            combined.addAll(f);
            combined.add(ch);
            combined.addAll(s);

            per(combined, remaining, res);
        }
    }
}
