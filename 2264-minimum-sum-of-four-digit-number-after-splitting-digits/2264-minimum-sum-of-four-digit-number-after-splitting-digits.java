class Solution {
    public int minimumSum(int num) {
        int a[]=new int[4];
        int i=0;
        while(num>0)
        {
            a[i++]=num%10;
            num/=10;
        }
        Arrays.sort(a);
       int v1=(10*a[0])+a[2];
        int v2=(10*a[1])+a[3];return v1+v2;


    }
}