/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class S05 {
    public String replaceSpace(String s) {
        return s.replace(s, "%20");
    }
    
    public String replaceSpace1(String s){
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==' ')
                sb.append("%20");
            else
                sb.append(c);
        }
        return sb.toString();
    }
}
