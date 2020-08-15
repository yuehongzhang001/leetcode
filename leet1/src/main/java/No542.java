/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No542 {
    public int[][] updateMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++){
            int start=-10000;
            for(int j=0;j<c;j++){
                if(matrix[i][j]<10000)
                    start=j;
                }
                    matrix[i][j]=j-start;
            }
            int end=c+10000-1;
            for(int j=c-1;j>=0;j--){
                if(matrix[i][j]==0)
                    end=j;
                else{
                    matrix[i][j]=Math.min(matrix[i][j], end-j);
                }
            }
        }
        for(int i=0;i<c;i++){
            int start=-10000;
            for(int j=0;j<r;j++){
                if(matrix[j][i]==0)
                    start=j;
                else
                    matrix[j][i]=Math.min(j-start, matrix[j][i]);
            }
            int end=r+10000-1;
            for(int j=r-1;j>=0;j--){
                if(matrix[j][i]==0)
                    end=j;
                else{
                    matrix[j][i]=Math.min(matrix[j][i], end-j);
                }
            }
        }
        return matrix;
    }
}
