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
public class No504 {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        StringBuilder sb =new StringBuilder();
        boolean neg = false;
        if(num<0){
            neg = true;
        }
        while(num!=0){
            sb.append(num%7);
            num/=7;
        }
        if(neg)
            sb.append("-");
        sb.reverse();
        return sb.toString();
    }
}
