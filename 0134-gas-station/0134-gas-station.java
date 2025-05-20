class Solution 
{
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int totalgas=0,totalcost=0;
        for(int i=0;i<gas.length;i++)
        {
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        if(totalgas<totalcost) return -1;
         int tank=0,idx=0;
        for(int i=0;i<gas.length;i++)
        {
            tank=tank+gas[i]-cost[i];
            if(tank<0)
            {
                tank=0;
                idx=i+1;
            }
        }
        return idx;
    }
}