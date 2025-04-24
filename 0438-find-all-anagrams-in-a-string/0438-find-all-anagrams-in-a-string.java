class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        Map<Character,Integer> mp1=new TreeMap<>();
        Map<Character,Integer> mp2=new TreeMap<>();
        for(char i:p.toCharArray())
        mp2.put(i,1+mp2.getOrDefault(i,0));
        List<Integer> li=new ArrayList<>();
        int k=p.length();
        int l=0;
        for(int r=0;r<s.length();r++)
        {
            mp1.put(s.charAt(r),1+mp1.getOrDefault(s.charAt(r),0));
            if(r-l==k)
            {
                int val=mp1.get(s.charAt(l));
                val--;
                mp1.put(s.charAt(l),val);
                if(val==0) mp1.remove(s.charAt(l));
                l++;
            }
            if(r-l+1==k)
            {
                if(mp1.equals(mp2)) li.add(l);
            }
        }

return li;
    }
}