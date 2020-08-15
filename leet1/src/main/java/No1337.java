
import java.util.Arrays;

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
import javafx.util.Pair;
public class No1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int len=mat.length;
        int[] ans =new int[k];
        Integer[] rows=new Integer[len];
        for(int i=0;i<len;i++){
            rows[i]=i;
        }
        int[] map = new int[len];
        for(int i=0;i<len;i++){
            int low=0;
            int high=mat[0].length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(mat[i][mid]==0)
                    high=mid-1;
                else
                    low=mid+1;
            }
            map[i]=high+1;
        }
        Arrays.sort(rows,(a,b)->{
            if(map[a]!=map[b])
                return map[a]-map[b];
            else
                return a-b;
        });
        for(int i=0;i<k;i++){
            ans[i]=rows[i];
        }
        return ans;
    }
    
    public int[] kWeakestRows1(int[][] mat, int k){
        int len=mat.length;
        int[] ans =new int[k];
        int p=0;
        for(int j=0;j<=mat[0].length;j++){
            for(int i=0;i<len;i++){
                if(j==mat[0].length && mat[i][j-1]!=0){
                    ans[p++]=i;
                }else if((j==0 && mat[i][j]==0) || (j>0 && mat[i][j-1]!=0 && mat[i][j]==0))
                    ans[p++]=i;
                if(p==k)
                    return ans;
            }
        }
        return null;
    }
    
    public int[] kWeakestRows2(int[][] mat, int k){
        int len1 = mat.length;
        int len2 = mat[0].length;
        int[] ans =new int[k];
        Pair<Integer,Integer>[] ps =  new Pair[len1];
        for(int i=0;i<len1;i++){
            int low=0;
            int high=len2-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(mat[i][mid]==0)
                    high=mid-1;
                else
                    low=mid+1;
            }
            ps[i]=new Pair(high+1,i);
        }
        Arrays.sort(ps,(Pair<Integer,Integer> a,Pair<Integer,Integer> b)->{
            if(a.getKey()!=b.getKey())
                return a.getKey()-b.getKey();
            else
                return a.getValue()-b.getValue();
        });
        for(int i=0;i<k;i++){
            ans[i]=ps[i].getValue();
        }
        return ans;
    }
}
