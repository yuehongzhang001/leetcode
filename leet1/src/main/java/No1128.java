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
public class No1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<String,Integer> map = new HashMap();
        for(int[] arr:dominoes){
            Arrays.sort(arr);
            String s=arr[0]+""+arr[1];
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        int ans=0;
        for(int n:map.values()){
            ans+=n*(n-1)/2;
        }
        return ans;
    }
}
