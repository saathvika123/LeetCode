class Solution {
    public int[][] flipAndInvertImage(int[][] a) {
        for(int i[]:a)
        {
            int start=0,end=i.length-1;
            while(start<end)
            {
                int temp=i[start];
                i[start]=i[end];
                i[end]=temp;
                start++;
                end--;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(a[i][j]==1)
                a[i][j]=0;
                else a[i][j]=1;
            }
        }
        return a;
    }
}