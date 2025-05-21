class Solution {
    public int findMinArrowShots(int[][] points) 
    {
        int arrow=0;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        // for(int i=0;i<points.length;i++)
        // {
        //     System.out.print(points[i][0]+" "+points[i][1]);
        //     System.out.println();
        // }
        int x=points[0][1];
    
        for(int i=1;i<points.length;i++)
        {
            if(points[i][0]<=x)
            {
                continue;
            }
            else
            {
            arrow++;
                x=points[i][1];
            }
        }
        return arrow+1;
    }
}