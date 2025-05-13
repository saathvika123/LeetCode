class Solution {
    public int minimumSum(int num) {
        int a[]=new int[4];
        int i=0;
        while(num!=0)
        {
            a[i++]=num%10;
            num/=10;
        }
        Arrays.sort(a);
        String s1=String.valueOf(a[0]);
        s1=s1+String.valueOf(a[2]);
         String s2=String.valueOf(a[1]);
        s2=s2+String.valueOf(a[3]);
        return Integer.parseInt(s1)+Integer.parseInt(s2);
    }
}