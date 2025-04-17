class Solution {
    public int maxVowels(String s, int k) 
    {
        int val=Integer.MIN_VALUE,ans=0,l=0;
        List<Character> li=new ArrayList<>();
        for(int r=0;r<s.length();r++)
        {
            li.add(s.charAt(r));
         if(s.charAt(r)=='a'||s.charAt(r)=='e' ||s.charAt(r)=='i'||s.charAt(r)=='o'||s.charAt(r)=='u' ) ans++;
            if(r-l==k)
            {
                if(li.get(l)=='a'|| li.get(l)=='o'||li.get(l)=='u'||li.get(l)=='i'||li.get(l)=='e')
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