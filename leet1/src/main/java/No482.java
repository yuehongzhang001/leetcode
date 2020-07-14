/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No482 {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        int count=0;
       for(int i=S.length()-1;i>=0;i--){
           char c = S.charAt(i);
           if(c!='-'){
               sb.append(Character.toUpperCase(c));
           }
       }
       sb=sb.reverse();
       for(int i=sb.length()-K;i>=1;i=i-K){
           sb.insert(i, '-');
       }
       
       return sb.toString();
    }
    
    public String licenseKeyFormatting1(String S, int K){
        S=S.replace("-", "");
        S = S.toUpperCase();
        StringBuffer sb = new StringBuffer(S);
        for(int i=S.length()-K;i>=1;i-=K){
            sb.insert(i, "-");
        }
        return sb.toString();
    }
}
