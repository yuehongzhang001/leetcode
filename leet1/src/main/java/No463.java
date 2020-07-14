/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No463 {
    public int islandPerimeter(int[][] grid) {
        int round = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==0) continue;
                if(i==0||grid[i-1][j]==0)
                    round++;
                if(i==grid.length-1||grid[i+1][j]==0)
                    round++;
                if(j==0||grid[i][j-1]==0)
                    round++;
                if(j==grid[i].length-1||grid[i][j+1]==0)
                    round++;
            } 
        }
        return round;
    }
}
