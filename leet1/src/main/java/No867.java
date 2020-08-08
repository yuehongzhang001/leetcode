/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No867 {
    public int[][] transpose(int[][] A) {
        int[][] ans = new int[A[0].length][];
        for(int i=0;i<ans.length;i++){
            ans[i]=new int[A.length];
            for(int j=0;j<A.length;j++){
                ans[i][j]=A[j][i];
            }
        }
        return ans;
    }
}
