import java.util.LinkedList;

class pair{
    int m,n;
    public pair(int x,int y)
    {
        this.m=x;
        this.n=y;
    }
}
public class Solution {
    public void solve(char[][] board) {
        if(board == null || board.length <=2 || board[0]==null || board[0].length <=2)return;
        LinkedList<pair> lists = new LinkedList<pair>();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(i==0 || j==0 || i==(board.length-1) || j==(board[0].length-1))
                {
                    if(board[i][j]=='O')lists.add(new pair(i, j));
                }
            }
        }

        while(!lists.isEmpty())
        {
            pair cur = lists.pop();
            int x=cur.m;
            int y=cur.n;
            if(board[x][y]=='Y')continue;
            board[x][y]='Y';
            if(y+1<board[0].length && board[x][y+1]=='O') lists.add(new pair(x, y+1));
            if(y-1>=0 && board[x][y-1]=='O')lists.add(new pair(x, y-1));
            if(x+1<board.length && board[x+1][y]=='O')lists.add(new pair(x+1, y));
            if(x-1>=0 && board[x-1][y]=='O')lists.add(new pair(x-1, y));
        }

        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='O')board[i][j]='X';
                if(board[i][j]=='Y')board[i][j]='O';
            }
        }
    }
}
