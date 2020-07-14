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
public class No345 {
    public String reverseVowels(String s) {
        char[] cs = s.toCharArray();
        int len = cs.length;
        ArrayList<Character> list = new ArrayList();
        
        for(int i=0,j=s.length()-1;i<j;){
            while(i<len && !isIt(cs[i])) i++;
            while(j>=0 && !isIt(cs[j])) j--;
            if(i<j){
                char temp = cs[i];
                cs[i] = cs[j];
                cs[j] = temp;
                i++;
                j--;
                continue;
            }else
                break;
            
        }
        return String.valueOf(cs);
    }
    
    public boolean isIt(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
}
