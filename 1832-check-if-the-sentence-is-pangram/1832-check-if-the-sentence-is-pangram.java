class Solution {
    public boolean checkIfPangram(String s) {
        Set<Character> als=new HashSet<>();
        //if(s.length()<=26) return false;
        //for(char i='a';i<='z';i++){
          //  als.add(i);
        //}
        /*
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            als.remove(ch);
            if(als.isEmpty()) return true;
        }
        return false;
        */
        //return als.size() == 26;
        Set<Character> uniqueChars = new HashSet<>();
        
        // Add each character from the string to the set
        for (char ch : s.toCharArray()) {
            uniqueChars.add(ch);
        }

        // If set size is 26, all letters are present
        return uniqueChars.size() == 26;

    }
}