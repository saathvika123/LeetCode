class Solution {
    public List<String> summaryRanges(int[] a) 
    {
        if(a.length==0) return new ArrayList<>();
        List<String> l=new ArrayList<>();
        String x="";
        String y="";
        int c=a[0];
        int fi=a[0];
        int li=a[0];
        for(int i:a)
        {
            if(c==i)
            {
                li=i;
                c++;
            }
            else
            {
                 x=Integer.toString(li);
                 y=Integer.toString(fi);
                if(x.equals(y))
                    l.add(x);
                else
                    l.add(y+"->"+x);
                c=i+1;
                li=i;
                fi=i;
            }
        }
        x=Integer.toString(li);
                 y=Integer.toString(fi);
        if(x.equals(y))
                    l.add(x);
                else
                    l.add(y+"->"+x);
        return l;
    }
}