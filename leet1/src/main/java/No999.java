/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No999 {
    public int numRookCaptures(char[][] board) {
        int ans=0;
        int m=0;
        int n=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j]=='R'){
                    m=i;
                    n=j;
                    break;
                }
                    
            }
        }
        int[] dx={0,-1,0,1};
        int[] dy={-1,0,1,0};
        for(int d=0;d<4;d++){
            int i=m+dy[d];
            int j=n+dx[d];
            while(i>=0 && j>=0 &&i<8 && j<8){
                if(board[i][j]=='p'){
                    ans++;
                    break;
                }
                else if(board[i][j]=='B')
                    break;
                i+=dy[d];
                j+=dx[d];
            }
        }
        return ans;
    }
}
