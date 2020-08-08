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
public class No1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int r=grid.length;
        int c=grid[0].length;
        List<List<Integer>> ans =new ArrayList();
        for(int i=0;i<r;i++){
            List<Integer> list = new ArrayList();
            for(int j=0;j<c;j++){
                list.add(0);
            }
            ans.add(list);
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int nj=(j+k)%c;
                int ni=((j+k)/c+i)%r;
                ans.get(ni).set(nj, grid[i][j]);
            }
        }
        return ans;
    }
}
