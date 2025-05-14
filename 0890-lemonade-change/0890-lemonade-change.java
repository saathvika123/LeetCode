class Solution {
    public boolean lemonadeChange(int[] a) {
        long five=0,ten=0,tenty=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==5)
            {
                five++;
            }
            else if(a[i]==10)
            {
                ten++;
                    if(five<=0) return false;
                    else
                    five--;
                
            }
            else
            {
                if(ten>=1 && five>=1) 
                {
                    ten--;
                    five--;
                }
                else if(five>=3) five=five-3;
                else return false;
               

            }
        }
        return true;
    }
}