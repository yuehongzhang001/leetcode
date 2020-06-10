/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No9 {
    public static boolean isPalindrome(int x) {
        if(x<0) return false;
        int copy=x;
        int reversed=0;
        while(x!=0){
            int digit=x%10;
            reversed=reversed*10+digit;
            x/=10;
        }
        return reversed==copy?true:false;
    }
}
