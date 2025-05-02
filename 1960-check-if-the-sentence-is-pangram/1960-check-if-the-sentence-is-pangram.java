class Solution 
{
    public boolean checkIfPangram(String s) 
    {

Set<Character> mp=new HashSet<>();   
     for(int i=0;i<s.length();i++)
        {
mp.add(s.charAt(i));        }
        if(mp.size()==26) return true;
        return false;
    }
}