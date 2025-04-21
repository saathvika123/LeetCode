class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) 
    {
        int l=0,ans=Integer.MIN_VALUE;
        int dup[]=grumpy.clone();
        for(int r=0;r<grumpy.length;r++)
        {
            dup[r]=0;
            if(r-l==minutes)
            {
                dup[l]=grumpy[l];
                l++;
            }
            if(r-l+1==minutes)
            {

                int val=func(customers,dup);
                ans=Math.max(val,ans);

            }
        }
        return ans;
    }
    public int func(int a[],int b[])
    {
        int c=0;
        for(int i=0;i<b.length;i++)
        {
            if(b[i]==0)
            {
                c=c+a[i];
            }
        }
        return c;
    }
}