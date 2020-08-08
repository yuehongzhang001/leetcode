/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No661 {
    public int[][] imageSmoother(int[][] M) {
        int r = M.length;
        int c = M[0].length;
        int[][] res = new int[r][];
        for(int i=0;i<r;i++){
            res[i]=new int[c];
            for(int j=0;j<c;j++){
                int sum=M[i][j];
                int count=1;
                if(j>0) {
                    sum+=M[i][j-1];
                    count++;
                    if(i>0){
                        sum+=M[i-1][j-1];
                        count++;
                    }
                }
                if(j<c-1) {
                    sum+=M[i][j+1];
                    count++;
                    if(i<r-1){
                        sum+=M[i+1][j+1];
                        count++;
                    }
                }
                if(i>0) {
                    sum+=M[i-1][j];
                    count++;
                    if(j<c-1){
                        sum+=M[i-1][j+1];
                        count++;
                    }
                }
                if(i<r-1){
                    sum+=M[i+1][j];
                    count++;
                    if(j>0){
                        sum+=M[i+1][j-1];
                        count++;
                    }
                }
                res[i][j]=sum/count;
            }
        }
        return res;
        
    }
    
     public int[][] imageSmoother1(int[][] M) {
        int r = M.length;
        int c = M[0].length;
        int[][] res = new int[r][];
        for(int i=0;i<r;i++){
            res[i]=new int[c];
            for(int j=0;j<c;j++){
                int sum=0;
                int count=0;
                for(int s=i-1;s<i+2;s++){
                    for(int k=j-1;k<j+2;k++){
                        if(s>=0 && k>=0 && s<r && k<c){
                            sum+=M[s][k];
                            count++; 
                        }
                    }
                }
                res[i][j]=sum/count;
            }
        }
        return res;
     }
}
