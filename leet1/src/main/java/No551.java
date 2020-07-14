/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No551 {
    public boolean checkRecord(String s) {
        int times = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='A'){
                if(times>=1)
                    return false;
                else
                    times+=1;
            }else if(c=='L'){
                if(i>0 && i<s.length()-1 && s.charAt(i-1)=='L' && s.charAt(i+1)=='L')
                    return false;
            }
        }
        return true;
    }
    
    public boolean checkRecord1(String s){
        return s.indexOf("A")==s.lastIndexOf("A") && s.indexOf("LLL")==-1;
    }
}
