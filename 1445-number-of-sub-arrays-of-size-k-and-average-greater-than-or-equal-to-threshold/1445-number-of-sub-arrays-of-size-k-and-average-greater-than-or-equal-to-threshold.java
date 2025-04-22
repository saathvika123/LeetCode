class Solution {
    public int numOfSubarrays(int[] a, int k, int t) 
    {
        int l=0,c=0;
        int sum=0;
        for(int r=0;r<a.length;r++)
        {
            sum=sum+a[r];
            if(r-l==k)
            {
                sum-=a[l];
                l++;
            }
            if(r-l+1==k)
            {
                int avg=(sum/k);
                if(avg>=t) c++;
            }
        }return c;
    }
}