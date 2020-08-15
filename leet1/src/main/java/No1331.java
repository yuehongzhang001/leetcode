
import java.util.Arrays;

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
public class No1331 {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0) return arr;
        HashMap<Integer,Integer> map = new HashMap();
        int[] copy=Arrays.copyOf(arr,arr.length);
        Arrays.sort(copy);
        int k=1;
        map.put(copy[0],k);
        for(int i=1;i<copy.length;i++){
            if(copy[i]!=copy[i-1])
                k++;
            map.put(copy[i], k);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
    
    
}
