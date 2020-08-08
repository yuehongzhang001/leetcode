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
public class No888 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] res=null;
        int sum=0;
        HashSet<Integer> set = new HashSet();
        for(int n:A)
            sum+=n;
        for(int n:B){
            sum-=n;
            set.add(n);
        }

        int diff=sum/2;
        for(int n:A){
            if(set.contains(n-diff)){
                res=new int[]{n,n-diff};
                break;
            }  
        }
        return res;
    }
}
