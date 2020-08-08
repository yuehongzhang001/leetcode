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
public class No728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList();
        int n=left;
        while(n<=right){
            int m=n;
            boolean flag=true;
            while(m!=0){
                if( n%(m%10)!=0){
                    flag=false;
                    break;
                }
                m/=10;
            }
            if(flag) list.add(n);
            n++;
        }
        return list;
    }
}
