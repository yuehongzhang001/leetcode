/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No859 {
    public boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length() || A.length()<2) return false; 
        Character c1=null;
        Character c2=null;
        int times=0;
        int[] map=new int[26];
        for(int i=0;i<A.length();i++){
            map[A.charAt(i)-'a']+=1;
            if(A.charAt(i)!=B.charAt(i)){
                if(times==0){
                    c1=A.charAt(i);
                    c2=B.charAt(i);
                    times++;
                }else if(times==1){
                    if(A.charAt(i)!=c2 || B.charAt(i)!=c1)
                        return false;
                    times++;
                }else
                    return false;
                
            }    
        }
        for(int n:map){
            if(times==0 && n>1)
                return true;
        }
        return times==2;
    }
}
