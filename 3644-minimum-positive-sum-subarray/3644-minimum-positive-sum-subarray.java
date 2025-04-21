class Solution {
    public int minimumSumSubarray(List<Integer> a, int li, int ri) 
    {
      int b=Integer.MAX_VALUE;
        for(int k=li;k<=ri;k++)
        {
           int ans=func(k,a);
          // System.out.println(ans);
           if(ans>0)
           b= Math.min(b,ans);
        }
        return b==Integer.MAX_VALUE?-1:b;
    }
    public int func(int k,List<Integer> a)
    {
        int val=Integer.MAX_VALUE;
        int l=0,c=0;
          for(int r=0;r<a.size();r++)
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
        return val;
    }
}