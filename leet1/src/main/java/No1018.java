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
public class No1018 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> ans = new ArrayList();
        int sum = 0;
        for(int n:A){
            sum = (sum*2+n)%5;
            ans.add(sum%5==0);
        }
        return ans;
    }
}
