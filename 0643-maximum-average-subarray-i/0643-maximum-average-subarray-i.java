class Solution 
{
    public double findMaxAverage(int[] a, int k) 
    {
        double ans=0;
        double val=Integer.MIN_VALUE;
        int l=0;
        for(int r=0;r<a.length;r++)
        {
            ans=ans+a[r];
            if(r-l==k)
            {
                ans=ans-a[l];
                l++;
            }
            if(r-l+1==k)
            val=Math.max(ans,val);
        }
        return val/(double)k;
    }
}