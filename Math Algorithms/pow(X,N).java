class Solution {
    public double myPow(double x, int n) {
        long n1=n;
        if(n<0) n1=Math.abs(n1);
        double res=1.0;

        while(n1>0)
       {
           if(n1%2!=0)
           {
               res=res*x;
           }
           x=x*x;
           n1=n1/2;
       } 
       return n<0?1/res : res;
    }
}