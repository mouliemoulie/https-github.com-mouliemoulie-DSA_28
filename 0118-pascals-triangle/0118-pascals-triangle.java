class Solution {
    public List<List<Integer>> generate(int nR) {
        List<List<Integer>> res=new ArrayList<>();
        int sum=0;
        for(int i=0;i<nR;i++){
            List<Integer> t=new ArrayList<>();
            if(i==0){
                t.add(1);
            }
            else if(i==1){
                t.add(1);
                t.add(1);
            }
            else{
                t.add(1);
                sum=0;
                int k=res.get(res.size()-1).size();
                //int j=1;
                for(int j=1;j<k;j++){
                    sum += res.get(res.size() - 1).get(j - 1) + res.get(res.size() - 1).get(j);
                    t.add(sum);
                    sum=0;
                }
                t.add(1);
            }
            res.add(t);
        }
        return res;
    }
}