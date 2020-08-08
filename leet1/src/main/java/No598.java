/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No598 {
    public int maxCount(int m, int n, int[][] ops) {
        int minRow = m;
        int minColumn = n;
        for(int i=0;i<ops.length;i++){
            minRow = Math.min(minRow, ops[i][0]);
            minColumn = Math.min(minColumn, ops[i][1]);
        }
        return minRow*minColumn;
    }
}
