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
public class No541 {
    public String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i+=2*k){
            StringBuilder sb = new StringBuilder();
            int j=i;
            for(;j<s.length()&& j<i+k;j++){
                sb.append(s.charAt(j));
            }
            sb.reverse();
            res.append(sb);
            for(;j<s.length()&& j<i+2*k;j++){
                res.append(s.charAt(j));
            }
        }
        return res.toString();
    }
    
    public String reverseStr1(String s, int k){
        char[] chs = s.toCharArray();
        for(int i=0;i<chs.length;i+=2*k){
            int low = i;
            int high = Math.min(chs.length-1, i+k-1);
            while(low<high){
                char tmp = chs[high];
                chs[high]=chs[low];
                chs[low]=tmp;
                low++;
                high--;
            }
        }
        return String.valueOf(chs);
    }
}
