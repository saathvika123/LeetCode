class Solution {
    public boolean checkInclusion(String s1, String s2) 
    {
        Map<Character,Integer> mp1=new HashMap<>();
        Map<Character,Integer> mp2=new HashMap<>();
        int n1=s1.length(),n2=s2.length();
        for(int i=0;i<n1;i++)
            mp1.put(s1.charAt(i), mp1.getOrDefault(s1.charAt(i), 0) + 1);
        int l=0;
        for(int r=0;r<n2;r++)
        {
            mp2.put(s2.charAt(r),mp2.getOrDefault(s2.charAt(r), 0) + 1);
            if(r-l==n1)
            {
                int val=mp2.get(s2.charAt(l));
                val--;
                mp2.put(s2.charAt(l),val);
                if(val==0) mp2.remove(s2.charAt(l));
                l++;
            }
            if(r-l+1==n1)
            {
                if(mp1.equals(mp2)) return true;
            }
        }return false;
    }
}