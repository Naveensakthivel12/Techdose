class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n<2) return 0;
        int c=0,max=0;

        for(int i=0;i<n-1;i++){
            c=nums[i+1]-nums[i];
            if(max<c) max=c; 
        }
        return max;
    }
}