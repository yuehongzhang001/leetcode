/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No459 {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        if(len%2==0 && s.substring(0, len/2).equals(s.substring(len/2)))
            return true;
        for(int i=0;i<len/2;i++){
            boolean fail=false;
            int j=i+1;
            for(;j<len;j++){
                if(s.charAt(j)!=s.charAt(j%(i+1))){
                    fail=true;
                    break;
                }   
            }
            if(!fail && j%(i+1)==0)
                return true;
        }
        return false;
    }
}
