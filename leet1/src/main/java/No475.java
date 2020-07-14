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
public class No475 {
    
    public int findRadius(int[] houses, int[] heaters){
        Arrays.sort(houses);
        Arrays.sort(heaters);
        if(heaters.length==0||houses.length==0) return -1;
        int len1 = houses.length;
        int len2 = heaters.length;
        int res = 0;
        int j=0;
        for(int i=0;i<len1;i++){
            while(j<len2-1 && heaters[j]<houses[i])
                j++;
            if(j==0){
                res = Math.max(res, Math.abs(heaters[j]-houses[i]));
            }else{
                res = Math.max(res, Math.min(Math.abs(houses[i]-heaters[j-1]), Math.abs(heaters[j]-houses[i])));
            }
        }
        return res;
    }
    
}
