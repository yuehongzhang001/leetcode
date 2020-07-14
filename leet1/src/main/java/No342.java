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
public class No342 {
    public boolean isPowerOfFour(int num) {
        if(num==0) return false;
        while(num%4==0){
            num/=4;
        }
        return num==1;
    }
    
    public boolean isPowerOfFour1(int num){
        return (Math.log(num)/Math.log(4)%1)==0;
    }
    public boolean isPowerOfFour2(int num){
        return list.contains(num);
    }
    
    public static ArrayList<Integer> list = powers();
    public static ArrayList<Integer>  powers(){
        int max=15;
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        for(int i=1;i<max+1;i++){
            int prev=list.get(i-1);
            list.add(prev*4);
        }
        return list;
    }
    
}
