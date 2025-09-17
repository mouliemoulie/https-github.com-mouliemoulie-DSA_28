class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> fre=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            fre.put(ch,fre.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> p=new  PriorityQueue<>((a,b)->(fre.get(b)-fre.get(a)));
        for(char key:fre.keySet()){
            p.add(key);
        }
        String res="";
        while(p.size()>0){
             char c=p.poll();
             for(int i=0;i<fre.get(c);i++){
                res+=c;
             }
        }
        return res;
    }
}