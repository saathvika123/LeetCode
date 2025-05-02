class Solution {
    public String firstPalindrome(String[] s) 
    {
        for(int i=0;i<s.length;i++)
        {
            
       StringBuilder sb1=new StringBuilder(s[i]);
       StringBuilder sb2=sb1.reverse();
            if(s[i].equals(sb2.toString()))
             return s[i];
        }return "";
    }
}