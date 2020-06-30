/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuehongzhang
 */
import java.util.HashSet;
public class No202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet();
        while(n!=1){
            int result=0;
            while(n!=0){
                result+=(n%10)*(n%10);
                n/=10;
            }
            if(set.contains(result))
                return false;
            set.add(result);
            n=result;
        }
        return true;
    }
    public boolean isHappy1(int n){
        int slow=n;
        int fast=getNext(n);
        while(fast!=1 && fast!=slow){
            slow=getNext(slow);
            fast=getNext(getNext(fast));
        }
        return fast==1;
    }
    
    public int getNext(int n){
        int reuslt=0;
        while(n!=0){
            reuslt+=(n%10)*(n%10);
            n/=10;
        }
        return reuslt;
    }
}
