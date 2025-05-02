class Solution {
    public int countDigits(int num) {
        int c=0;
        int n=num;
        while(num>0)
        {
            if(n%(num%10)==0) c++;
            num=num/10;
        }return c;
    }
}