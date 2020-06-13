/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No58 {
     public static int lengthOfLastWord(String s) {
        int end=s.length()-1;
        int i=end;
        boolean hit=false;
        for(;i>=0;i--){
            char c = s.charAt(i);
            if(!hit && c!=' '){
                end=i;
                hit=true;
            }
            if(hit && c==' '){
                return end-i;
            }
        }
        if(!hit) return 0;
        return end+1;
    }
    public static int lengthOfLastWord1(String s){
        int end=s.length()-1;
        while(end>=0 && s.charAt(end)==' ') end--;
        if(end<0) return 0;
        int start=end;
        while(start>=0 && s.charAt(start)!=' ') start--;
        return end-start;
    }
}
