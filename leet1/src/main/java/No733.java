/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]!=newColor)
            Fill(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }
    
    public void Fill(int[][] image, int sr, int sc, int newColor,int d){
        image[sr][sc]=newColor;
        if((sr==0 || image[sr-1][sc]!=d)&&(sr==image.length-1 || image[sr+1][sc]!=d)
                &&(sc==0||image[sr][sc-1]!=d)&&(sc==image[0].length-1 || image[sr][sc+1]!=d))
            return;
        if((sr!=0 && image[sr-1][sc]==d))
            Fill(image,sr-1,sc,newColor,d);
        if(sr!=image.length-1 && image[sr+1][sc]==d)
            Fill(image,sr+1,sc,newColor,d);
        if(sc!=0&&image[sr][sc-1]==d)
            Fill(image,sr,sc-1,newColor,d);
        if(sc!=image[0].length-1&&image[sr][sc+1]==d)
            Fill(image,sr,sc+1,newColor,d);
        return;
    }
    
     public void dfs(int[][] image, int sr, int sc, int newColor,int d){
         if(image[sr][sc]==d){
             image[sr][sc]=newColor;
             if(sr>=1) dfs(image,sr-1,sc,newColor,d);
             if(sr<=image.length-2) dfs(image,sr+1,sc,newColor,d);
             if(sc>=1) dfs(image,sr,sc-1,newColor,d);
             if(sc<=image[0].length-2) dfs(image,sr,sc+1,newColor,d);
         }
     }
}
