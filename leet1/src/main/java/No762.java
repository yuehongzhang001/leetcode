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
public class No762 {
    public int countPrimeSetBits(int L, int R) {
        int[] arr = {0,0,1,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,1};
       
        int res=0;
        for(int n=L;n<=R;n++){
            res+=arr[Integer.bitCount(n)];
        }
        return res;
    }
    
    
}
