/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1275 {
    public String tictactoe(int[][] moves) {
        String player="A";
        int[][] chess = new int[3][3];
        for(int i=0;i<moves.length;i++){
            int r=moves[i][0];
            int c=moves[i][1];
            chess[r][c]=player=="A"?1:-1;
            if(chess[r][0]==chess[r][1]&&chess[r][1]==chess[r][2] 
                    || chess[0][c]==chess[1][c]&&chess[1][c]==chess[2][c]
                    || r==c && chess[0][0]==chess[1][1] && chess[1][1]==chess[2][2]
                    || r+c==2 && chess[0][2]==chess[1][1] && chess[1][1]==chess[2][0])
            {
                return player;
            }
             player=player=="A"?"B":"A";  
        }
        return moves.length==9?"Draw":"Pending";
    }
}
