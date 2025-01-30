class Solution {
    public boolean checkIfPangram(String s) {
        Set<Character> als=new HashSet<>();
        for(char i='a';i<='z';i++){
            als.add(i);
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            als.remove(ch);
            if(als.isEmpty()) return true;
        }
        return false;
    }
}