class Solution {
    public int numRookCaptures(char[][] board)
    {
        int r=board.length;
        int c=board[0].length;
        int count=0;
        int i=0,j=0;
        int val=0;
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(board[i][j]=='R') 
                {
                    val=1;
                    break;
                }
            }
            if(val==1) break;
        }
        int posy=j;
        while(posy<c)
        {
            if(board[i][posy]=='p')
            {
                count++;
                break;
            }
            else if(board[i][posy]=='B')
            {
                 break;
            }
            posy++;
        }
int negy=j;
        while(negy>=0)
        {
            if(board[i][negy]=='p')
            {
                count++;
                break;
            }
            else if(board[i][negy]=='B')
            {
                 break;
            }
            negy--;
        }
        int posx=i;
        while(posx<r)
        {
            if(board[posx][j]=='p')
            {
                count++;
                break;
            }
            else if(board[posx][j]=='B')
            {
                 break;
            }
            posx++;
        }
        int negx=i;
        while(negx>=0)
        {
            if(board[negx][j]=='p')
            {
                count++;
                break;
            }
            else if(board[negx][j]=='B')
            {
                 break;
            }
            negx--;
        }
        return count;

    }
}