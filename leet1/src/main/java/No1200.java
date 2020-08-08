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
public class No1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
         List<List<Integer>> ans = new ArrayList();
         Arrays.sort(arr);
         int min=2000000;
         for(int i=0;i<arr.length-1;i++){
             min=Math.min(min, arr[i+1]-arr[i]);
         }
         for(int i=0;i<arr.length-1;i++){
             if(arr[i+1]-arr[i]==min){
                 ArrayList<Integer> list= new ArrayList();
                 list.add(arr[i]);
                 list.add(arr[i+1]);
                 ans.add(list);
             }  
         }
         return ans;
    }
}
