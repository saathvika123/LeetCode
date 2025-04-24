class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        if(s.length()==0) return 0;
        Map<Character,Integer> mp=new HashMap<>();
        int l=0,val=Integer.MIN_VALUE;
        for(int r=0;r<s.length();r++)
        {
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
            while(mp.get(s.charAt(r))>1)
            {
                int f=mp.get(s.charAt(l));
                f--;
                mp.put(s.charAt(l),f);
                if(f==0) mp.remove(s.charAt(l));
                l++;
            }
            val=Math.max(val,r-l+1);
        }
       return val;
    }
}