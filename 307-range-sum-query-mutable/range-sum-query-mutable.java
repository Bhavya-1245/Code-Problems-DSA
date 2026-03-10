class NumArray {
    static int[] seg;
    static int n;
    public NumArray(int[] nums) {
        this.n = nums.length;
        this.seg = new int[n*4];
        buildTree(nums, 0, 0, n-1);
    }

    static void buildTree(int[] nums, int idx, int l, int r){
      if(l == r){
        seg[idx] = nums[l];
        return;
      }
      int mid = l + (r-l)/2;

      buildTree(nums, 2*idx+1, l, mid);
      buildTree(nums, 2*idx+2, mid+1, r);

      seg[idx] = seg[2*idx + 1] + seg[2*idx + 2];

      return;
    }
    
    public void update(int index, int val) {
        update(index, val, 0, 0, n-1);
    }
    
    public int sumRange(int left, int right) {
        return sumRange(left, right, 0, 0, n-1);
    }

    public static void update(int k, int val, int idx, int l, int r){
      if(l == r){
        seg[idx] = val;
        return;
      }

      int mid = l + (r-l)/2;
      if(k>mid) update(k, val, 2*idx+2, mid+1, r);
      else update(k, val, 2*idx+1, l, mid);

      seg[idx] = seg[idx*2+1] + seg[idx*2+2];
      return;
    }

    public static int sumRange(int ql, int qr, int idx, int l, int r){
      if(ql>r || qr<l) return 0;
      if(ql<=l &&qr>=r) return seg[idx];

      int mid = l + (r-l)/2;
      int left = sumRange(ql, qr, idx*2+1, l, mid);
      int right = sumRange(ql, qr, idx*2+2, mid+1, r);

      return left+right;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */