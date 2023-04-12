class Solution {
    public int[] countBits(int n) {
        int []arr=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int ctr=0,r=i;
            while(r>0)
            {
                r&=r-1;
                ctr++;
            }
            arr[i]=ctr;
        }
        return arr;
    }
}