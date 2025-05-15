class Solution {
    ArrayList<Integer> arr;
    public int findKthLargest(int[] nums, int k) {
        arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            insert(nums[i]);
        }
        int lar=0;
        for(int i=0;i<k;i++){
            lar=remove();
        }
        return lar;
    }
    private void insert(int n){
        arr.add(n);
        upheap(arr.size()-1);
    }
    private void upheap(int ind){
        int p=parent(ind);
        if(arr.get(p)<arr.get(ind)){
            swap(p,ind);
            upheap(p);
        }
    }
    
    private void swap(int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }
    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }
    public int remove(){
        if(arr.isEmpty()) return -1;
        int temp=arr.get(0);
        int last=arr.remove(arr.size()-1);
        if(!arr.isEmpty()){}
        arr.set(0,last);
        downheap(0);
    }
        return temp;
    }
    private void downheap(int small){
        int max=small;
        int l=left(small);
        int r=right(small);
        if(l<arr.size() && arr.get(l)>arr.get(max)) max=l;
        if(r<arr.size() && arr.get(r)>arr.get(max)) max=r;
        if(max!=small){
        swap(max,small);
        downheap(max);
        }
    }
}