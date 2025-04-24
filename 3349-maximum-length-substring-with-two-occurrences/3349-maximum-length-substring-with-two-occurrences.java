class Solution {
    public int maximumLengthSubstring(String s)
     {
        Map<Character,Integer> mp=new HashMap<>();
        int l=0,ans=Integer.MIN_VALUE;
        for(int r=0;r<s.length();r++)
        {
            mp.put(s.charAt(r),1+mp.getOrDefault(s.charAt(r),0));
            while(mp.get(s.charAt(r))>2)
            {
                int val=mp.get(s.charAt(l));
                val--;
                mp.put(s.charAt(l),val);
                if(val==0) mp.remove(s.charAt(l));
                l++;
            }
                ans=Math.max(ans,r-l+1);
        }return ans;
    }
}