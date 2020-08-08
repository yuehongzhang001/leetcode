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
public class No1030 {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] ans = new int[R*C][2];
        int k=0;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                ans[k][0]=i;
                ans[k][1]=j;
                k++;
            }
        }
        Arrays.sort(ans,(a,b)->{
            return Math.abs(a[0]-r0)+Math.abs(a[1]-c0)-(Math.abs(b[0]-r0)+Math.abs(b[1]-c0));
        });
        return ans;
    }
    
    
    public int[][] allCellsDistOrder1(int R, int C, int r0, int c0){
        int[][] ans = new int[R*C][2];
        ans[0][0]=r0;
        ans[0][1]=c0;
        int count=1;
        int[] dr={-1,1,1,-1};
        int[] dc={-1,-1,1,1};
        int c=c0;
        int r=r0;
        while(count<R*C){
            c++;
            for(int j=0;j<4;j++){
                while((j%2==0 && c!=c0) || (j%2==1 && r!=r0)){
                    if(c<C &&c>=0 && r<R && r>=0){
                        ans[count][1]=c;
                        ans[count][0]=r;
                        count++;
                    }
                    c+=dc[j];
                    r+=dr[j];
                }    
            }
        }
        return ans;
    }
}
