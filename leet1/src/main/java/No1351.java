/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1351 {
    public int countNegatives(int[][] grid) {
        int len2=grid[0].length;
        int ans=0;
        int low=0;
        int high=len2-1;
        for(int i=0;i<grid.length;i++){
            
            while(low<=high){
                int mid=(low+high)/2;
                if(grid[i][mid]>=0)
                    low=mid+1;
                else
                    high=mid-1;
            }
            ans+=len2-low;
            high=low==len2?low-1:low;
            low=0;
        }
        return ans;
    }
    
    public int countNegatives1(int[][] grid){
        int len2=grid[0].length;
        int pos=len2-1;
        int ans=0;
        for(int i=0;i<grid.length;i++){
            if(grid[i][0]<0){
                ans+=len2;
            }else{
                for(int j=pos;j>=0;j--){
                if(grid[i][j]>=0){
                    pos=j;
                    break;
                }   
            }
            ans+=len2-pos-1;
            }
            
        }
        return ans;
    }
    
    public int countNegatives2(int[][] grid){
        int len2=grid[0].length;
        int pos=len2;
        int ans=0;
        for(int i=0;i<grid.length;i++){
            int j=pos-1;
            for(;j>=0;j--){
                if(grid[i][j]>=0){
                    ans+=len2-1-j;
                    break;
                }
            }
            pos=j+1;
        }
        return ans;
    }
}
