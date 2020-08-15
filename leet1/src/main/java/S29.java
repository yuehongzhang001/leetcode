/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class S29 {
    public int[] spiralOrder(int[][] matrix) {
        int[] ans=new int[matrix.length*matrix[0].length];
        int left=0;
        int right=matrix[0].length-1;
        int up=1;
        int down=matrix.length-1;
        int[] direction = {1,1,-1,-1};
        int round=0;
        while(left<=right && up<=down){
            int i=round%4;
            
        }
    }
}
