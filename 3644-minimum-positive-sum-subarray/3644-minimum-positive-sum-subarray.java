class Solution {
    public int minimumSumSubarray(List<Integer> a, int li, int ri) 
    {
      int b=Integer.MAX_VALUE;
      int n=a.size();
        for(int k=li;k<=ri;k++)
        {
           // System.out.println(func(k,n,a));
           int ans=func(k,n,a);
           if(ans>0)
           b= Math.min(b,ans);
        }
        return b==Integer.MAX_VALUE?-1:b;
    }
    public int func(int k,int n,List<Integer> a)
    {
        int val=Integer.MAX_VALUE;
        int l=0,c=0;
          for(int r=0;r<n;r++)
        {
            c=c+a.get(r);
            if(r-l==k)
            {
                c=c-a.get(l);
                l++;
            }
            if(r-l+1==k)
            {
                if(c>0) 
                val=Math.min(val,c);
            }
        }
        return (val==Integer.MAX_VALUE?-1:val);

    }
}