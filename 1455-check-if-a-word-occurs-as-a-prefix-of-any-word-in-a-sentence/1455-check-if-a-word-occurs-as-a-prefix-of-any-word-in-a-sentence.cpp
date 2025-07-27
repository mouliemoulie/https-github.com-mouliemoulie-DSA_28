class Solution {
public:
    int isPrefixOfWord(string sentence, string searchWord) {
        istringstream iss(sentence);
        int index=1;
        string word;
        while(iss>>word){
            if(word.find(searchWord)==0) return index;
            index++;
        }
        return -1;
    }
};