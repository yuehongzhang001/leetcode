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
public class No1002 {
    public List<String> commonChars(String[] A) {
        List<String> ans = new ArrayList();
        int[] m1= new int[26];
        for(char c:A[0].toCharArray()){
            m1[c-'a']++;
        }
        for(String s:A){
            int[] m2 = new int[26];
            for(char c:s.toCharArray()){
                m2[c-'a']++;
            }
            for(int i=0;i<26;i++){
                m1[i]=Math.min(m1[i], m2[i]);
            }
        }
        for(int n=0;n<26;n++){
            char c=(char)(n+'a');
            for(int i=0;i<m1[n];i++){
                ans.add(String.valueOf(c));
            }
        }
        return ans;
    }
}
