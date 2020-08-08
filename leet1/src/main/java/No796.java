/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No796 {
    public boolean rotateString(String A, String B) {
        if(A.length()!=B.length()) return false;
        StringBuilder sb = new StringBuilder(A);
        for(int i=0;i<A.length();i++){
            if(sb.toString().equals(B))
                return true;
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
        }
        return sb.toString().isEmpty()?true:false;
    }
     public boolean rotateString1(String A, String B){
         return A.length()==B.length() && (A+A).contains(B);
     }
}
