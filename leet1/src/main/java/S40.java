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
public class S40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] ans = new int[k];
        Arrays.sort(arr);
        for(int i=0;i<k;i++){
            ans[i]=arr[i];
        }
        return ans;
    }
    public int[] getLeastNumbers1(int[] arr, int k) {
        int[] map =new int[10001];
        int[] ans = new int[k];
        for(int n:arr){
            map[n]++;
        }
        int i=0;
        int j=0;
        while(i<k){
            if(map[j]>0){
                ans[i++]=map[j];
                map[j]=map[j]-1;
            }
                
            else
                j++;
        }
        return ans;
    }
    
}
