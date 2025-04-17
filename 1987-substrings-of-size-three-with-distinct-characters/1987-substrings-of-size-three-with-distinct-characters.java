class Solution {
    public int countGoodSubstrings(String s) 
    {
        int l=0,c=0;
        Map<Character,Integer> mp=new HashMap<>();
        for(int r=0;r<s.length();r++)
        {
            mp.put(s.charAt(r), 1 + mp.getOrDefault(s.charAt(r), 0));
            if(r-l==3)
            {
                int count=mp.get(s.charAt(l));
                count--;
                mp.put(s.charAt(l),count);
                if(count==0) mp.remove(s.charAt(l));
                l++;
            }
            if(r-l+1==3)
            {
                if(mp.size()==3) c++;
            }
        }
        return c;
    }
}