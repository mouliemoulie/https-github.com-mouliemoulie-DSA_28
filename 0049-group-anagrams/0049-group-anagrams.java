class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int[] c=new int[26];
            for(char ch:strs[i].toCharArray()) c[ch-'a']++;
            String key="";
            for(int cnt:c){
                key+="#";
                key+=String.valueOf(cnt);
            }
            res.computeIfAbsent(key,k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(res.values());
    }
}