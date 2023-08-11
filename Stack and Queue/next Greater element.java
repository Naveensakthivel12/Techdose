class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       Stack<Integer>s=new Stack<>();
       int n=nums2.length;
       int []arr=new int[nums2.length];
       for(int i=nums2.length-1;i>=0;i--){
           int element=nums2[i];
           while(!s.isEmpty() && s.peek()<=element){
               s.pop();
           }
          if(s.isEmpty()){
              arr[i]=-1;
          }
          else{
              arr[i]=s.peek();
          }
           s.push(element);
       }
       int []res=new int[nums1.length];
       for(int i=0;i<nums1.length;i++){
           int k=0;
           for(int j=0;j<nums2.length;j++){
               if(nums1[i]==nums2[j]){
                   k=j;
               }
           }
           res[i]=arr[k];
       }
       return res;
       
    }
}
