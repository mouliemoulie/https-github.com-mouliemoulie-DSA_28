class Solution {
public:
    vector<int> minOperations(string boxes) {
        vector<int> res;
        for(int i=0;i<boxes.size();i++){
            int opmov=0;
            for(int j=0;j<boxes.size();j++){
                if(boxes[j]!='0'){
                    opmov+=abs(j-i);
                }
            }
            res.push_back(opmov);
        }
        return res;
    }
};