class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        TreeSet<Integer> seen = new TreeSet<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        
        for (int freq : hm.values()) {
            if (seen.contains(freq)) return false;
            seen.add(freq);
        }
        
        return true;
    }
}