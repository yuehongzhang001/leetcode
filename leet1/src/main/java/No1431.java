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
public class No1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList();
        
        int max=0;
        for(int n:candies)
            max=Math.max(max, n);
        for(int n:candies){
            list.add(n+extraCandies>=max?true:false);
        }
        return list;
    }
}
