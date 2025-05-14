import java.math.BigInteger;
class Solution {
    public String removeDigit(String s, char digit)
     {
BigInteger mn = new BigInteger("-9");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==digit)
            {
                String s1="";
                String s2="";
                int l=0;
                while(i>=1&&l<=i-1)
                {
                s1=s1+s.charAt(l);
                l++;
                }
                int h=i+1;
                while(h<s.length())
                {
                s1=s1+s.charAt(h);
                h++;
                }
                BigInteger val=new BigInteger(s1.concat(s2));
                if(mn.compareTo(val)==-1) mn=val;
                // mn=Math.max(mn,val);
            }
        }
            return String.valueOf(mn);
    }
}