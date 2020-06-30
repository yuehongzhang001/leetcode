
import java.lang.reflect.Array;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.Arrays;
public class No204 {
    public int countPrimes(int n) {
        if(n<3) return 0;
        boolean[] nums = new boolean[n];
        Arrays.fill(nums, true);
        for(int i=2;i*2<n;i++){
              nums[i*2]=false;
        }
        for(int i=3;i<Math.sqrt(n);i++){
            if(nums[i]==true){
                for(int j=3;i*j<n;j+=2){
                    nums[i*j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(nums[i]==true) count++;
        }
        return count;
    }
}
