class Solution {
    public int findDuplicate(int[] a) 
    {
     int b[]=new int[a.length];
     for(int i:a)
     if(b[i]==0)
     b[i]=1;
     else return i;  
     return 0;
    }
}