class Solution 
{
    public boolean checkIfPangram(String s) 
    {
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        if(mp.size()==26) return true;
        return false;
    }
}