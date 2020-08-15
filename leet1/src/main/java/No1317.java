/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1317 {
    public int[] getNoZeroIntegers(int n) {
        int i=1;
        while(i<n){
            if(noZero(i) && noZero(n-i)) return new int[]{i,n-i};
            i++;
        }
        return null;
    }
    public boolean noZero(int n){
        while(n!=0){
            if(n%10==0) return false;
            n/=10;
        }
        return true;
    }
    
    public int[] getNoZeroIntegers1(int n) {
        int i=1;
        while(i<n){
            if((""+i).indexOf("0")==-1 && (n-i+"").indexOf("0")==-1) return new int[]{i,n-i};
            i++;
        }
        return null;
    }
}
