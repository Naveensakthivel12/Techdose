class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int ind=0;
        int p=0;        
        for(int i=0;i<prices.length;i++)
        {
            if(min>prices[i]){
                min=prices[i];
            }
            ind=prices[i]-min;
            if(p<ind){
                p=ind;
            }
        }
        return p;
    }
}