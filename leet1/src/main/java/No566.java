/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row = nums.length;
        if(row==0) return nums;
        int column = nums[0].length;
        if(row*column != r*c || row==r&&column==c)
            return nums;
        int[][] res = new int[r][];
        int count=0;
        for(int i=0;i<r;i++){
            res[i] = new int[c];
            for(int j=0;j<c;j++){
                res[i][j] = nums[count/column][count%column];
                count++;
            }
        }
        return res;
    }
}
