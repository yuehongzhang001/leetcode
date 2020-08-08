/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No840 {
    public int numMagicSquaresInside(int[][] grid) {
        int ans=0;
        for(int i=1;i<grid.length-1;i++){
            for(int j=1;j<grid[0].length-1;j++){
                //check if the numbers are same
                int num = grid[i][j];
                if(num>9||num<1) continue;
                if(notValid(grid[i-1][j-1],num) || notValid(grid[i-1][j],num) || notValid(grid[i-1][j+1],num)
                        ||notValid(grid[i][j-1],num) || notValid(grid[i][j+1],num) || notValid(grid[i+1][j-1],num)
                        ||notValid(grid[i+1][j],num) || notValid(grid[i+1][j+1],num))
                    continue;
                if(grid[i-1][j-1]==num || grid[i-1][j]==num || grid[i-1][j+1]==num
                        ||grid[i][j-1]==num || grid[i][j+1]==num || grid[i+1][j-1]==num
                        ||grid[i+1][j]==num || grid[i+1][j+1]==num)
                    continue;
                //check if the sum are all same
                int sum=grid[i-1][j-1]+grid[i-1][j]+grid[i-1][j+1];
                if(grid[i][j-1]+grid[i][j]+grid[i][j+1]!=sum)
                    continue;
                if(grid[i+1][j-1]+grid[i+1][j]+grid[i+1][j+1]!=sum)
                    continue;
                if(grid[i-1][j-1]+grid[i][j-1]+grid[i+1][j-1]!=sum)
                    continue;
                if(grid[i-1][j]+grid[i][j]+grid[i+1][j]!=sum)
                    continue;
                if(grid[i-1][j+1]+grid[i][j+1]+grid[i+1][j+1]!=sum)
                    continue;
                if(grid[i-1][j-1]+grid[i][j]+grid[i+1][j+1]!=sum)
                    continue;
                if(grid[i-1][j+1]+grid[i][j]+grid[i+1][j-1]!=sum)
                    continue;
                ans++;
            }
        }
        return ans;
    }
    
    public boolean notValid(int n,int num){
        return n==num || n>9 ||n<1;
    }
    
     public int numMagicSquaresInside1(int[][] grid) {
        int ans=0;
        for(int i=1;i<grid.length-1;i++){
            for(int j=1;j<grid[0].length-1;j++){
                if(grid[i][j]!=5) continue;
                if(magic(grid[i-1][j-1],grid[i-1][j],grid[i-1][j+1],grid[i][j-1],grid[i][j],
                        grid[i][j+1],grid[i+1][j-1],grid[i+1][j],grid[i+1][j+1]))
                    ans++;
            }
        }
        return ans;
     }
     public boolean magic(int... val){
         int[] map =new int[10];
         for(int n:val){
             if(n>9 || n<1) return false;
             if(map[n]==0)
                 map[n]=1;
             else
                 return false;
         }
         return val[0]+val[1]+val[2]==15&&
                 val[3]+val[4]+val[5]==15&&
                 val[6]+val[7]+val[8]==15&&
                 val[0]+val[3]+val[6]==15&&
                 val[1]+val[4]+val[7]==15&&
                 val[2]+val[5]+val[8]==15&&
                 val[0]+val[4]+val[8]==15&&
                 val[2]+val[4]+val[6]==15;
     }
}
