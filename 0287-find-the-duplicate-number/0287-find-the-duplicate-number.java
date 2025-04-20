class Solution {
    public int findDuplicate(int[] a) 
    {
     int b[]=new int[a.length];
     int i=0;
     for(i=0;i<a.length;i++)
     if(b[a[i]]==0)
     b[a[i]]=1;
     else break;
     return a[i];
    }
}