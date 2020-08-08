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
public class No1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] map = new int[1001];
        for(int i=0;i<arr2.length;i++){
            map[arr2[i]]=i+1;
        }
        Integer[] a1 = new Integer[arr1.length];
        for(int i=0;i<arr1.length;i++){
            a1[i]=arr1[i];
        }
        Arrays.sort(a1,new Comparator(){
            public int compare(Object m,Object n){
                Integer a=(Integer)m;
                Integer b=(Integer)n;
                if(map[a]>0&&map[b]>0)
                return map[a]-map[b];
            else if(map[a]==0&&map[b]==0)
                return a-b;
            else
                return map[b]-map[a];
            }
        });
        for(int i=0;i<arr1.length;i++){
            arr1[i]=a1[i];
        }
        return arr1;
    }
    
    public int[] relativeSortArray1(int[] arr1, int[] arr2){
        int[] map = new int[1001];
        for(int n:arr1)
            map[n]++;
        int i=0;
        for(int n:arr2){
            while(map[n]!=0){
                arr1[i++]=n;
                map[n]--;
            }      
        }
        for(int n=0;n<1001 && i<arr1.length;n++){
            while(map[n]>0){
                arr1[i++]=n;
                map[n]--;
            }
        }
        return arr1;
    }
}
