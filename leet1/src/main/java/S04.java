/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class S04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int low=0;
        int high=matrix.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(matrix[mid][0]>target)
                high=mid-1;
            else if(matrix[mid][0]==target)
                return true;
            else
                low=mid+1;
        }
        int r=high;
        low=0;
        high=matrix[0].length-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(matrix[r][mid]==target)
                return true;
            else if(matrix[r][mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return false;
    }
}
