/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1299 {
    public int[] replaceElements(int[] arr) {
        int max=-1;
        for(int i=arr.length-1;i>=0;i--){
            int tmp=arr[i];
            arr[i]=max;
            max=Math.max(max, tmp);
        }
        return arr;
    }
    public int[] replaceElements1(int[] arr){
        int len=arr.length;
        int[] ans = new int[len];
        int max=-1;
        for(int i=arr.length-1;i>=0;i--){
            ans[i]=max;
            max=Math.max(max, arr[i]);
        }
        return ans;
    }
    
}
