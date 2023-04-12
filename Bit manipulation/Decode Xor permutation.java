class Solution {
    public int[] decode(int[] encoded) {
        int n=encoded.length+1;
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            ans^=i;
        }
        int []arr=new int[n];
        for(int i=1;i<n;i+=2)
        {
            ans^=encoded[i];
        }
        arr[0]=ans;
        for(int i=1;i<n;i++)
        {
            arr[i]=encoded[i-1]^arr[i-1];
        }
        return arr;
    }
}