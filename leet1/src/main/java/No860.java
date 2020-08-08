/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.*;
public class No860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten=0;
        for(int n:bills){
            if(n==5)
                five++;
            else if(n==10){
                if(five<1)
                    return false;
                ten++;
                five--;
            }else{
                if(five<1)
                    return false;
                else if(five<3){
                    if(ten<1)
                        return false;
                    ten--;
                    five--;
                }else{
                    if(ten>=1){
                        ten--;
                        five--;
                    }else{
                        five-=3;
                    } 
                }
                    
            }
        }
        return true;
    }
}
