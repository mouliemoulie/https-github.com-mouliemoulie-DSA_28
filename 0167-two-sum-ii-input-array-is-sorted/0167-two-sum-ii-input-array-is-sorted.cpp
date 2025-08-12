class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
     int h=numbers.size()-1;
     int l=0;
    vector<int> ans;
     /*while(l<h){
        int mid=l+(h-l)/2;
        if(numbers[mid]+numbers[mid+1]==target){
            ans.push_back(mid+1);
            ans.push_back(mid+2);
            return ans;
        }
        else if(numbers[mid]+numbers[mid+1]>target){
            h=mid-1;
        }
        else{
            l=mid+1;
        }
      }*/
      while(l<h){
        if(numbers[l]+numbers[h]==target) {
            ans.push_back(l+1);
            ans.push_back(h+1);
            return ans;
        }
        else if(numbers[l]+numbers[h]>target){
            h--;
        }
        else if(numbers[l]+numbers[h]<target) {
            l++;
        }
      }
      return ans;   
    }
};