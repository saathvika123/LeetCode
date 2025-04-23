class Solution {
    public int minimumCost(int[] a) {
        Arrays.sort(a);int t=0,an=0;
        for(int i=a.length-1;i>=0;i--)
        if(t==2) t=0;
        else{
            an+=a[i];t++;
        }return an;
    }
}