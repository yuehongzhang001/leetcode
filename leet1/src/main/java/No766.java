/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rl = matrix.length;
        int cl = matrix[0].length;
        for(int k=0;k<cl;k++){
            int startNum=matrix[0][k];
            for(int i=1,j=k+1;i<rl&&j<cl;i++,j++){
                if(matrix[i][j]!=startNum){
                    return false;
                }
            }
        }
        for(int k=1;k<rl;k++){
            int startNum=matrix[k][0];
            for(int i=k+1,j=1;i<rl&&j<cl;i++,j++){
                if(matrix[i][j]!=startNum)
                    return false;
            }
        }
        return true;
    }
    
    public boolean isToeplitzMatrix1(int[][] matrix){
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]!=matrix[i-1][j-1])
                    return false;
            }     
        }
        return true;
    }
}
