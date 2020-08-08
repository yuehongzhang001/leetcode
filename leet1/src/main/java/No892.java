/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No892 {
    public int surfaceArea(int[][] grid) {
        int N=grid.length;
        int top = 0;//count the none zero number
        int side = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(grid[i][j]!=0)
                    top++;
                if(j!=0){
                    side-=Math.min(grid[i][j-1],grid[i][j]);
                    if(grid[i][j-1]<grid[i][j])
                        side+=grid[i][j]-grid[i][j-1];
                }else{
                    side+=grid[i][j];
                }
                if(i!=0){
                    side-=Math.min(grid[i-1][j], grid[i][j]);
                    if(grid[i-1][j]<grid[i][j])
                        side+=grid[i][j]-grid[i-1][j];
                }
                else
                    side+=grid[i][j];
                side+=2*grid[i][j];
            }
        }
        return top*2+side;
    }
    public int surfaceArea1(int[][] grid){
        int N=grid.length;
        int res=0;
        int[] dr = {0,-1,0,1};
        int[] dc = {1,0,-1,0};
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(grid[i][j]!=0)
                    res+=2;
                for(int d=0;d<4;d++){
                    int nr=i+dr[d];
                    int nc=j+dc[d];
                    if(nr>=0&&nc>=0 &&nr<N && nc<N)
                        res+=Math.max(grid[i][j]-grid[nr][nc], 0);
                    else
                        res+=grid[i][j];
                }
            }
        }
        return res;
    }
}
