class Solution {
    ArrayList<Integer> arr;
    public int maxProduct(int[] nums) {
        arr=new ArrayList();
        for (int num : nums) {
            insert(num);
        }
        int first = remove();  
        int second = remove(); 

        return (first - 1) * (second - 1);
    }
    public void insert(int n){
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
     private int remove() {
        if (arr.size() == 0) return -1;

        int max = arr.get(0);
        int last = arr.remove(arr.size() - 1);

        if (arr.size() > 0) {
            arr.set(0, last);
            downheap(0);
        }

        return max;
    }

    private void downheap(int i) {
        int max = i;
        int l = left(i), r = right(i);

        if (l < arr.size() && arr.get(l) > arr.get(max)) max = l;
        if (r < arr.size() && arr.get(r) > arr.get(max)) max = r;

        if (max != i) {
            swap(i, max);
            downheap(max);
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
}