class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int r=l1+l2;
        double []arr=new double[r];

        for(int i=0;i<arr.length;i++)
        {
            if(i<l1)
            {
            arr[i]=nums1[i];
            }
            else
            arr[i]=nums2[arr.length-i-1];
        }
        Arrays.sort(arr);
        double k=arr.length;
        if(arr.length%2!=0){
            return arr[arr.length/2];
        }
        else return (arr[arr.length/2]+arr[(arr.length-1)/2])/2;
    
    }
}