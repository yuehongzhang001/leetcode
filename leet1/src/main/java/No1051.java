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
public class No1051 {
    public int heightChecker(int[] heights) {
        int count=0;
        int len=heights.length;
        int[] sorted = Arrays.copyOf(heights,len);
        Arrays.sort(sorted);
        for(int i=0;i<heights.length;i++){
            if(sorted[i]!=heights[i])
                count++;
        }
        return count;
            
    }
}
