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
public class No970 {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        HashSet<Integer> set  =new HashSet();
        for(int i=0;i<=20 &&Math.pow(x, i)<bound;i++){
            for(int j=0;j<=20 &&Math.pow(y, j)<bound;j++){
                int res=(int)(Math.pow(x, i)+Math.pow(y,j));
                if(res<=bound){
                    set.add(res);
                }else{
                    break;
                }
            }
        }
        return new ArrayList(set);
    }
}
