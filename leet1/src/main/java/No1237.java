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
public class No1237 {
    
    public class CustomFunction{
        public int f(int x, int y){return 0;}
    }
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> ans = new ArrayList();
        int low=1;
        int high=1000;
        for(int i=1;i<=1000;i++){
            low=1;
            if(customfunction.f(i,high)<z) continue;
            if(customfunction.f(i,1)>z) break;
            while(low<=high){
                int mid=(high+low)/2;
                int val=customfunction.f(i, mid);
                if(val>z)
                    high=mid-1;
                else if(val<z)
                    low=mid+1;
                else{
                    List<Integer> list= new ArrayList();
                    list.add(i);
                    list.add(mid);
                    ans.add(list);
                    high=mid-1;
                    break;
                }
            }
        }
        return ans;
    }
}
