/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No883 {
    public int projectionArea(int[][] grid) {
        int xy=0;//count the nonezero number
        int xz=0;//find the max in the same row;
        int yz=0;//find the max int he sam column;
        for(int i=0;i<grid.length;i++){
            int max=grid[i][0];
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0)
                    xy++;
                max=Math.max(max,grid[i][j]);
            }
            xz+=max;
        }
        for(int j=0;j<grid[0].length;j++){
            int max=grid[0][j];
            for(int i=0;i<grid.length;i++){
                max=Math.max(max, grid[i][j]);
            }
            yz+=max;
        }
        return xy+xz+yz;
    }
    public int projectionArea1(int[][] grid){
        int res=0;
        int N=grid.length;
        for(int i=0;i<N;i++){
            int bestColumn = 0;
            int bestRow = 0;
            for(int j=0;j<N;j++){
                if(grid[i][j]!=0)
                    res++;
                bestColumn = Math.max(bestColumn, grid[j][i]);
                bestRow = Math.max(bestRow, grid[i][j]);
            }
            res+=bestColumn+bestRow;
        }
        return res;
    }
}
