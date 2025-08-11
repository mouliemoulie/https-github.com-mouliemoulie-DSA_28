class Solution {
public:
    vector<int> minOperations(string boxes) {
        /*vector<int> res;
        for(int i=0;i<boxes.size();i++){
            int opmov=0;
            for(int j=0;j<boxes.size();j++){
                if(boxes[j]!='0'){
                    opmov+=abs(j-i);
                }
            }
            res.push_back(opmov);
        }*/
        int n=boxes.size();
        vector<int> leftcost(n,0),rightcost(n,0),res(n,0);
        int ball=0,opcost=0;
        for(int i=0;i<boxes.size();i++){
            leftcost[i]=opcost;
            if(boxes[i]!='0') ball++;
            opcost+=ball;
        }
        ball=0;
        opcost=0;
        for(int i=boxes.size()-1;i>=0;i--){
            rightcost[i]=opcost;
            if(boxes[i]!='0') ball++;
            opcost+=ball;
        }
        for(int i=0;i<boxes.size();i++){
           res[i]=leftcost[i]+rightcost[i];
        }
        return res;
    }
};