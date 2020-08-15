/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1346 {
    public boolean checkIfExist(int[] arr) {
        int[] map = new int[2001];
        for(int n:arr)
            map[n+1000]++;
        for(int n=-500; n<=500;n++){
            if(n!=0 && map[n+1000]!=0 && map[2*n+1000]!=0){
                return true;
            }else if(n==0 && map[n+1000]>1)
                return true;
        }
        return false;
    }
}
