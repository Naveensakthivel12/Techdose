class Solution {
    public int findKthLargest(int[] nums, int k) {
       PriorityQueue<Integer>q=new PriorityQueue<>();
       int n=nums.length;
       for(int i=0;i<nums.length;i++){
           q.offer(nums[i]);
       }
       int t=0;
       while(!q.isEmpty()){
        if(t==n-k){
            return q.poll();
        }
        q.poll();
        t++;
       }
       return 0;
    }
}


//
class Solution {
    public int findKthLargest(int[] nums, int k) {
       Arrays.sort(nums);
       return nums[nums.length-k];
    }
}
