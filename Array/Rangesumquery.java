class NumArray {
    int num[];
    public NumArray(int[] nums) {
         num=new int[nums.length];
         for(int i=0;i<nums.length;i++){
             num[i]=nums[i];
         }
         
    }
    
    public int sumRange(int left, int right) {
        int sum=0;
        for(int i=left;i<=right;i++){
            sum+=num[i];
        }
        return sum;
    }
}