class Solution 
{
    public String longestPalindrome(String s)
     {
        String ans="";
        if(s.length()<=1)
        return s;
        for(int i=1;i<s.length();i++)
        {
            int low=i;
            int high=i;
            while(s.charAt(low)==s.charAt(high))
            {
                low--;
                high++;
                if(low==-1 || high==s.length())
                break;
            }
            String pal=s.substring(low+1,high);
            if(ans.length()<pal.length())
             ans=pal;

             low=i-1;
             high=i;
while(s.charAt(low)==s.charAt(high))
            {
                low--;
                high++;
                if(low==-1 || high==s.length())
                break;
            }
            pal=s.substring(low+1,high);
            if(ans.length()<pal.length())
            ans=pal;
        }
        return ans;
    }
}