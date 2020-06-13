/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No38 {
    public static String countAndSay(int n) {
        if(n==1) return "1";
        String prevstr=countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        int start=0;
        char startChar = prevstr.charAt(0);
        int i=1;
        for(;i<prevstr.length();i++){
            char c = prevstr.charAt(i);
            if(c!=startChar){
                sb.append(i-start).append(startChar);
                
                start=i;
                startChar=c;
            }
        }
        return sb.append(i-start).append(startChar).toString();
    }
}
