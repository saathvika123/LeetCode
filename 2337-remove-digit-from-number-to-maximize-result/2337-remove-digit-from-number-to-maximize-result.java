class Solution {
    public String removeDigit(String a, char digit) {
       String mn="";
        
        for (int i=0;i<a.length(); i++)
         {
            if (a.charAt(i)==digit) 
            {
                String s=a.substring(0,i)+a.substring(i+1);
               if (mn.compareTo(s)<0)
                    mn=s;
            }
        }
        return mn;  
    }
}
