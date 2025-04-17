class Solution {
    public int divisorSubstrings(int num, int k) 
    {
        String s=Integer.toString(num);
        int l=0,c=0;
        for(int r=0;r<s.length();r++)
        {
            if(r-l==k)
            {
                l++;
            }
            if(r-l+1==k)
            {
                String st="";
                for(int p=l;p<=r;p++)
                {
                    st=st+s.charAt(p);
                }
                int val=Integer.parseInt(st);
                if( val!=0 &&num%val==0) c++;

            }
        }return c;
    }
}