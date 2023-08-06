class Solution {
    public int trap(int[] height) {
       int h=height.length;
       int left=0;
       int right=h-1;
       int lm=0;
       int rm=0;
       int res=0;
       while(left<=right)
       {
           if(height[left]<=height[right])
           {
               if(lm<height[left])
               {
                   lm=height[left];
               }
               res+=lm-height[left];
               left++;

           }
           else
           {
               if(rm<height[right])
               {
                   rm=height[right];
               }
               res+=rm-height[right];
               right--;

           }
       }
       return res;
    }
}