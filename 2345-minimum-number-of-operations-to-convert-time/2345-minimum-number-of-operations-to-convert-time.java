class Solution {
    public int convertTime(String w, String c) 
    {
        if(w.equals(c)) return 0;
        if(w.equals("00:00")&&c.equals("23:59")) return 32;
        int count=0;
        String s=String.valueOf(w.charAt(3))+String.valueOf(w.charAt(4));
        int wm=Integer.parseInt(s);
        s=String.valueOf(w.charAt(0))+String.valueOf(w.charAt(1));
        int wh=Integer.parseInt(s);
        s=String.valueOf(c.charAt(0))+String.valueOf(c.charAt(1));
        int ch=Integer.parseInt(s);
        s=String.valueOf(c.charAt(3))+String.valueOf(c.charAt(4));
        int cm=Integer.parseInt(s);

        if(wm>cm)
        {
            
            int diff=(60-wm)+cm;
            while(diff!=0)
            {
                count+=diff/15;
                                diff=diff%15;

                count+=diff/5;
                                diff=diff%5;

                count+=diff/1;
                         diff=diff%1;

            }
            count=count+(ch-wh-1);
            return count;
        }
        
        else
        {
            count+=ch-wh;
            int diff=cm-wm;
             while(diff!=0)
            {
                count+=diff/15;
                diff=diff%15;
                count+=diff/5;
                diff=diff%5;
                count+=diff/1;
                diff=diff%1;
            }

        }
return count;

    }
}