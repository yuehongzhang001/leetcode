/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No1446 {
    public int maxPower(String s) {
        int start=0;
        int ans=1;
        int i=1;
        for(;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                ans=Math.max(ans, i-start);
                start=i;
            }
        }
        ans=Math.max(ans, i-start);
        return ans;
    }
    
    public int maxPower1(String s){
        int currentL = 1;
        int ans=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1))
                currentL++;
            else{
                ans=Math.max(ans, currentL);
                currentL=1;
            }
        }
        return Math.max(ans, currentL);
    }
}
