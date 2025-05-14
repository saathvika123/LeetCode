class Solution {
    public int minimumMoves(String s) 
    {
        int i=0,c=0;
        while(i<s.length())
        {
            if(s.charAt(i)=='X')
            {
                c++;
                i=i+3;
            }
            else i++;
        }
return c;
    }
}