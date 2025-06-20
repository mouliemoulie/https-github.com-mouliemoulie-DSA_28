class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int l=0,r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
             if (mid > 0 && mid < n - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return mid; // Peak found
                } else if (arr[mid] > arr[mid - 1]) {
                    l = mid + 1; // Move right
                } else {
                    r = mid - 1; // Move left
                }
            } 
        }
        return -1;
    }
}