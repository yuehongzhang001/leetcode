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
public class No1042 {
    public int[] gardenNoAdj(int N, int[][] paths) {
        int[] ans =new int[N];
        HashMap<Integer,ArrayList<Integer>> ml =new HashMap();
        for(int[] path:paths){
            for(int i=0;i<2;i++){
                if(!ml.containsKey(path[i]))
                    ml.put(path[i], new ArrayList());
                ArrayList<Integer> list = ml.get(path[i]);
                list.add(path[(i+1)%2]);
            }
        }
        for(int g=1;g<=N;g++){
            int[] map = new int[4];
            ArrayList<Integer> list=ml.get(g);
            if(list!=null){
                for(int otherG:list){
                int f=ans[otherG-1];
                if(f!=0)
                    map[f-1]=1;
                }
            }
            int f=1;
            while(map[f-1]==1)f++;
            ans[g-1]=f;
        }

        return ans;
        
    }
}
