class Solution {
    public int numberOfAlternatingGroups(int[] col) 
    {
        int c=0;
        int k=col.length;
        if(k<3) return 0;
        if(col[k-2]==0 && col[k-1]==1 && col[0]==0) c++;
        if(col[k-2]==1 && col[k-1]==0 && col[0]==1) c++;
        if(col[k-1]==0 && col[0]==1 && col[1]==0) c++;
        if(col[k-1]==1 && col[0]==0 && col[1]==1) c++;
        int l=0;
        List<Integer> li=new ArrayList<>();
        for(int r=0;r<col.length;r++)
        {
            li.add(col[r]);
            if(r-l==3)
            {
                li.remove(0);
                l++;
            }
            if(r-l+1==3)
            {
                if(li.size()>=3){
                if(li.get(0)==0 && li.get(1)==1 && li.get(2)==0) c++;
                if(li.get(0)==1 && li.get(1)==0 && li.get(2)==1) c++;}

            }
        }

return c;
    }
}