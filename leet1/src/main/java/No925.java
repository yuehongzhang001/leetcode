/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No925 {
    public boolean isLongPressedName(String name, String typed) {
        int j=0;
        for(int i=0;i<name.length();i++){
            if(j==typed.length()){
                return false;
            }else if(name.charAt(i)!=typed.charAt(j)){
                while(i>=1 && j<typed.length() && typed.charAt(j-1)==typed.charAt(j)){
                    j++;
                }
                if(j==typed.length() || typed.charAt(j)!=name.charAt(i))
                    return false;
            }
            j++;
        }
        while(j<typed.length()){
            if(typed.charAt(j)!=typed.charAt(j-1))
                return false;
            j++;
        }
        return true;
    }
}
