class Solution {
    public boolean rotateString(String s, String g) {
        String con=g+g; 
        if ((s.length()==g.length()) && (con.contains(s))) return true;
        else return false;
    }
}