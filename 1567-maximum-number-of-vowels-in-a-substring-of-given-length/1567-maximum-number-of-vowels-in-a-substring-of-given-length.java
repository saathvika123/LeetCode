class Solution {
    public int maxVowels(String s, int k) 
    {
        int val=Integer.MIN_VALUE,ans=0,l=0;
        for(int r=0;r<s.length();r++)
        {
           if(s.charAt(r)=='a'||s.charAt(r)=='e' ||s.charAt(r)=='i'||s.charAt(r)=='o'||s.charAt(r)=='u' )
           ans++;
            if(r-l==k)
            {
               if(s.charAt(l)=='a'||s.charAt(l)=='e' ||s.charAt(l)=='i'||s.charAt(l)=='o'||s.charAt(l)=='u' )
                ans--;
                l++;
            }
            if(r-l+1==k)
            {
                val=Math.max(val,ans);
            }
        }
        return val;
    }
}