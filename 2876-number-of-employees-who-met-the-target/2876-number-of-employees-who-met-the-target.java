class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] a, int t) {
        Arrays.sort(a);
        int i=0;
        for(i=0;i<a.length;i++)
        {
            if(a[i]>=t) break;
        }
        return a.length-i;
    }
}