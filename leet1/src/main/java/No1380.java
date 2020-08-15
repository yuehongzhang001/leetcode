/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.*;
public class No1380 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        HashSet<Integer> set1=new HashSet();
        HashSet<Integer> set2=new HashSet();
        for(int i=0;i<matrix.length;i++){
            int rowMin = matrix[i][0];
            for(int j=0;j<matrix[0].length;j++){
                rowMin = Math.min(rowMin, matrix[i][j]);
            }
            set1.add(rowMin);
        }
        
        for(int j=0;j<matrix[0].length;j++){
            int coMax = matrix[0][j];
            for(int i=0;i<matrix.length;i++){
                coMax = Math.max(coMax, matrix[i][j]);
            }
            set2.add(coMax);
        }
        List<Integer> ans = new ArrayList();
        for(int n:set1){
            if(set2.contains(n))
                ans.add(n);
        }
        return ans;
    }
    
    public List<Integer> luckyNumbers1 (int[][] matrix){
        int len1=matrix.length;
        int len2=matrix[0].length;
        int[] rowMin=new int[len1];
        int[] colMax=new int[len2];
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                rowMin[i]=rowMin[i]==0?matrix[i][j]:Math.min(rowMin[i], matrix[i][j]);
                colMax[j]=Math.max(colMax[j], matrix[i][j]);
            }
        }
        List<Integer> ans = new ArrayList();
        for(int i=0;i<len1;i++){
            for(int j=0;j<len2;j++){
                if(matrix[i][j]==rowMin[i] && matrix[i][j]==colMax[j])
                    ans.add(matrix[i][j]);
            }
        }
        return ans;
    }
}
