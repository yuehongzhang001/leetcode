/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No434 {
    public int countSegments(String s) {
        int count=0;
        int len = s.length();
        for(int i=0;i<len;i++){
            while(i<len && s.charAt(i)==' '){
                i++;
            }
            if(i<len) 
                count++;
            while(i<len && s.charAt(i)!=' '){
                i++;
            }
        }
        return count;
    }
    public int countSegments1(String s){
        int count=0;
        int len = s.length();
        boolean wordProcessing = false;
        for(int i=0;i<len;i++){
            if(!wordProcessing){
                if(s.charAt(i)!=' '){
                    wordProcessing=true;
                    count++;
                }
                else
                    continue;
            }else{
                if(s.charAt(i)!=' ')
                    continue;
                else
                    wordProcessing=false;
            }
        }
        return count;
    }
    
    public int countSegments2(String s){
        String trimmed = s.trim();
        if(trimmed.equals(""))
            return 0;
        return trimmed.split(" ").length;
    }
}
