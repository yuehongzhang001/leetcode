/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No680 {
    public boolean validPalindrome(String s) {
        int low=0;
        int high=s.length()-1;
        while(low<high){
            if(s.charAt(high)!=s.charAt(low)){
                boolean flag1 = true;
                boolean flag2 = true;
                int l1=low+1;
                int h1=high;
                int l2=low;
                int h2=high-1;
                while(l1<h1){
                    if(s.charAt(l1)!=s.charAt(h1)){
                        flag1=false;
                        break;
                    }else{
                        l1++;
                        h1--;
                    }
                }
                while(l2<h2){
                    if(s.charAt(l2)!=s.charAt(h2)){
                        flag2=false;
                        break;
                    }else{
                        l2++;
                        h1--;
                    }
                }
                return flag1 || flag2;
            }else{
                low++;
                high--;
            }
        }
        return true;
    }
}
