class Solution {
    public int minimumRecolors(String s, int k) 
    {
           int l=0,c=0,ans=Integer.MAX_VALUE;
           for(int r=0;r<s.length();r++)
           {
            if(s.charAt(r)=='W') c++;
            if(r-l==k)
            {
                if(s.charAt(l)=='W') c--;
                l++;
            }
            if(r-l+1==k)
            {
            ans=Math.min(ans,c);
            }
           }return ans;
    }
}