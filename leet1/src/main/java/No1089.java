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
public class No1089 {
    public void duplicateZeros(int[] arr) {
        int n=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
                n++;
        }

        for(int i=arr.length-1;i>=0;i--){
            if(n==0) break;
            if(i+n<arr.length){
                arr[i+n]=arr[i];
            }
            if(arr[i]==0){
                n--;
                if(i+n<arr.length)
                    arr[i+n]=0;
            } 
        }
    }
}
