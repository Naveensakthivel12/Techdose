class Solution {
    public int hammingDistance(int x, int y) {
       int s=x^y;
       int ctr=0;
       while(s!=0)
       {
           ctr++;
            s&=s-1;
       }
       return ctr;
    }
}