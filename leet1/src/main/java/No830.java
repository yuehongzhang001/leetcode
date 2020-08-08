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
public class No830 {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> ans = new ArrayList<>();
        int start=0;
        for(int i=1;i<=S.length();i++){
            if(i==S.length() || S.charAt(i)!=S.charAt(i-1)){
                if(i-start>=3){
                    List<Integer> list = new ArrayList();
                    list.add(start);
                    list.add(i-1);
                    ans.add(list);
                }
                start=i;
            }
        }
        return ans;
    }
}
