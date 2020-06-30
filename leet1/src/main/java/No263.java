/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
public class No263 {
    public boolean isUgly(int num) {
        if(num<1) return false;
        if(num==1)
            return true;
        if(num%2==0)
            return isUgly(num/2);
        else if(num%3==0)
            return isUgly(num/3);
        else if(num%5==0)
            return isUgly(num/5);
        else
            return false;
                
    }
}
