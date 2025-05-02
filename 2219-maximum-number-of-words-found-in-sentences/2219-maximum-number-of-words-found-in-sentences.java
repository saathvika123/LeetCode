class Solution {
    public int mostWordsFound(String[] s) {
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<s.length;i++)
        {
            String str=s[i];
            String s1[]=str.split(" ");
            mx=Math.max(s1.length,mx);
        }
        return mx;
    }
}