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
public class No1005 {
    public int largestSumAfterKNegations(int[] A, int K) {
        int len = A.length;
        LinkedList<Integer> list = new LinkedList();
        Arrays.sort(A);
        for(int n:A){
            list.add(n);
        }
        for(int i=0;i<K;i++){
            int tmp = 0-list.get(0);
            list.remove(0);
            int j=0;
            for(;j<len-1;j++){
                if(tmp<list.get(j)) break;
            }
            list.add(j,tmp);
        }
        int sum=0;
        for(int n:list)
            sum+=n;
        return sum;
    }
    
    public int largestSumAfterKNegations1(int[] A, int K){
        int[] map = new int[201];
        for(int n:A){
            map[n+100]++;
        }
        for(int j=0;j<K;j++){
            int i=0;
            while(map[i]==0) i++;
            map[i]--;
            int min = i-100;
            map[-min+100]++;
        }
        int sum=0;
        for(int i=0;i<201;i++){
            sum+=(i-100)*map[i];
        }
        return sum;
    }
}
