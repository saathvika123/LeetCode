class Solution {
    public int numSubarrayProductLessThanK(int[] a, int k) 
    {
        if(k<=1) return 0;
        int l=0,p=1,c=0;
        for(int r=0;r<a.length;r++)
        {
            p=p*a[r];
            while(p>=k)
            {
                p/=a[l];
                l++;
                
            }
            c+=r-l+1;
        }return c;
    }
}
