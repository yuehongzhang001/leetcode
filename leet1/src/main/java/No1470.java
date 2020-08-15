
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
public class No1470 {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> list = new ArrayList();
        for(int i=0;i<n;i++){
            list.add(nums[i]);
            list.add(nums[i+n]);
        }
        for(int i=0;i<2*n;i++)
            nums[i]=list.get(i);
        return nums;
    }
    public int[] shuffle1(int[] nums, int n){
        int[] copy=Arrays.copyOf(nums, 2*n);
        for(int i=0;i<n;i++){
            nums[2*i]=copy[i];
            nums[2*i+1]=copy[i+n];
        }
        return nums;
    }
}
