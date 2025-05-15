class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0,c=0;
        if(s.length==0) return 0;
        while(i<g.length && j<s.length)
        {
            if(s[j]<g[i])
            {
                while(s[j]<g[i])
                {
                    j++;
                    if(j>=s.length) break;
                }
            }
            else if(s[j]>=g[i])
            {

                c++;
                i++;
                j++;
                if(i>=g.length ||j>=s.length) break;
            }
            
          
        }
        return c;
    }
}