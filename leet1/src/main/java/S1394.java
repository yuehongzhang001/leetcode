/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class S1394 {
    public int findLucky(int[] arr) {
        int[] map = new int[501];
        for(int n:arr)
            map[n]++;
        for(int i=500;i>=1;i--){
            if(map[i]==i)
                return i;
        }
        return -1;
    }
}
