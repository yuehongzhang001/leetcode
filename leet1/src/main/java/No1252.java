/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1252 {
    public int oddCells(int n, int m, int[][] indices) {
        int ans=0;
        int[][] matrix = new int[n][m];
        for(int[] order:indices){
            int i=order[0];
            int j=order[1];
            for(int k=0;k<m;k++){
                matrix[i][k]++;
            }
            for(int k=0;k<n;k++){
                matrix[k][j]++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]%2!=0)
                    ans++;
            }
        }
        return ans;
    }
    public int oddCells1(int n, int m, int[][] indices){
        int[] row=new int[n];
        int[] column=new int[m];
        for(int[] order:indices){
            row[order[0]]++;
            column[order[1]]++;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans+=(row[i]+column[j])%2;
            }
        }
        return ans;
    }
}
