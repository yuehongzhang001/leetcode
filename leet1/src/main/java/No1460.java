/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length!=arr.length) return false;
        int[] map =new int[1001];
        for(int n:target)
            map[n]++;
        for(int n:arr){
            if(map[n]==0)
                return false;
            map[n]--;
        }
        return true;
    }
}
