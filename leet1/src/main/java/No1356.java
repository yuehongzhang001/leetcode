
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
public class No1356 {
    public int[] sortByBits(int[] arr) {
        Integer[] list = new Integer[arr.length];
        for(int i=0;i<arr.length;i++)
            list[i]=arr[i];
        Arrays.sort(list,new Comparator(){
            public int compare(Object m,Object n){
                Integer a=(Integer)m;
                Integer b=(Integer)n;
                int bit=Integer.bitCount(a)-Integer.bitCount(b);
                if(bit!=0)
                    return bit;
                else
                    return a-b;
            }
            
        });
        for(int i=0;i<arr.length;i++){
            arr[i]=list[i];
        }
        return arr;
    }
}
