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
public class No575 {
    public int distributeCandies(int[] candies) {
        int len = candies.length;
        HashSet<Integer> set = new HashSet();
        for(int i=0;i<len;i++){
            set.add(candies[i]);
        }
        if(set.size()>len/2)
            return len/2;
        return set.size();
    }
    
    public int distributeCandies1(int[] candies){
        if(candies.length==0) return 0;
        Arrays.sort(candies);
        int count =1;
        for(int i=1;i<candies.length;i++){
            if(candies[i]!=candies[i-1])
                count++;
        }
        return count>candies.length/2?candies.length/2:count;
    }
}
