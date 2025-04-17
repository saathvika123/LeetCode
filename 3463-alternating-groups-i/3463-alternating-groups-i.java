class Solution {
    public int numberOfAlternatingGroups(int[] col) 
    {
        int k=col.length;
        if(k<3) return 0;
        int c=0;
        if(col[k-2]==0 && col[k-1]==1 && col[0]==0) c++;
        if(col[k-2]==1 && col[k-1]==0 && col[0]==1) c++;
        if(col[k-1]==0 && col[0]==1 && col[1]==0) c++;
        if(col[k-1]==1 && col[0]==0 && col[1]==1) c++;
        int l=0;
       // List<Integer> li=new ArrayList<>();
        for(int r=0;r<col.length;r++)
        {
            //li.add(col[r]);
            if(r-l==3)
            {
                //li.remove(0);
                l++;
            }
            if(r-l+1==3)
            {
                //if(li.size()>=3){
                if(col[r]==0 && col[r-1]==1 &&col[l]==0) c++;
                if(col[r]==1 && col[r-1]==0 && col[l]==1) c++;
                //}

            }
        }

return c;
    }
}