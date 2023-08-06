//leetcode problem
class Solution {
    public int[] sortArray(int[] nums) {
       sort(nums,0,nums.length-1);
       return nums;
    }
    public void sort(int []nums,int l,int r){
        if(l>=r){
            return ;
        }
        int start=l;
        int end=r;
        int mid=start+(end-start)/2;
        int pivot=nums[mid];
        while(start<=end){
            while(nums[start]<pivot){
                start++;
            }
            while(nums[end]>pivot){
                end--;
            }
            if( start <= end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        sort(nums,l,end);
        sort(nums,start,r);
    }
}