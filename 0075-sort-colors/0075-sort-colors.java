class Solution {
    public void sortColors(int[] nums) { 
        /*int count0 = 0, count1 = 0, count2 = 0;

        // Step 1: Count occurrences of 0, 1, and 2
        for (int num : nums) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else count2++;
        }

        // Step 2: Overwrite the array
        int i = 0;
        while (count0-- > 0) nums[i++] = 0;
        while (count1-- > 0) nums[i++] = 1;
        while (count2-- > 0) nums[i++] = 2; */
        bs(nums,nums.length,0);

    }
    public static void bs(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(c+1<r && arr[c]>arr[c+1]){
                int t=arr[c+1];
                arr[c+1]=arr[c];
                arr[c]=t;
            }
            bs(arr,r,c+1);
        }
        else{
            bs(arr,r-1,0);
        }
    }
}